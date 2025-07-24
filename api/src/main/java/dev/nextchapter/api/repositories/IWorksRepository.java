package dev.nextchapter.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dev.nextchapter.api.dto.WorksDTO;
import dev.nextchapter.api.entities.Works;

public interface IWorksRepository extends JpaRepository<Works, String> {

    @Query(
            value = "SELECT w.key, w.data->>'title' AS title, author_elem->'author'->>'key' AS author_key, "
            + "w.data->>'subtitle' AS subtitle, w.data->'description'->>'value' AS description, "
            + "w.data->'notes'->>'value' AS notes "
            + "FROM works w, jsonb_array_elements(w.data->'authors') AS author_elem "
            + "WHERE w.data->>'title' LIKE :titlePattern "
            + "LIMIT :limit",
            nativeQuery = true
    )
    List<WorksDTO> findWorksByTitleLikeFlat(@Param("titlePattern") String titlePattern, @Param("limit") int limit);
}
