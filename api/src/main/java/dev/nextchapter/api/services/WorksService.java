package dev.nextchapter.api.services;

import org.springframework.stereotype.Service;

import dev.nextchapter.api.dto.WorksDTO;
import dev.nextchapter.api.entities.Works;
import dev.nextchapter.api.mappers.WorksMapper;
import dev.nextchapter.api.repositories.IWorksRepository;


import java.util.List;

@Service
public class WorksService {
    private final IWorksRepository worksRepository;

    public WorksService(IWorksRepository workRepository) {
        this.worksRepository = workRepository;
    }

    public List<WorksDTO> findByTitle(String title) {
        return worksRepository.findWorksByTitleLikeFlat(title, 10);
    }

}
