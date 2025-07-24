package dev.nextchapter.api.repositories;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class IWorksRepositoryTests {
    @Autowired
    private IWorksRepository _worksRepository;

    @Test
    public void whenSearchingByTitleThatExists_thenWorksShouldBeFound() {
        // Plan
        String title = "Parla";
        // Act
        var result = _worksRepository.findWorksByTitleLikeFlat(title, 1);
        // Assert
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }
}
