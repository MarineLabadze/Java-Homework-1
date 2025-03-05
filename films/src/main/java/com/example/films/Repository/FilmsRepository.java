package com.example.films.Repository;

import com.example.films.Entity.Films;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface FilmsRepository extends JpaRepository<Films, Long> {
    @Query("SELECT f FROM Films f WHERE " +
            "(:title IS NULL OR LOWER(f.title) LIKE LOWER(CONCAT('%', :title, '%'))) AND " +
            "(:description IS NULL OR LOWER(f.description) LIKE LOWER(CONCAT('%', :description, '%'))) AND " +
            "(:releaseYear IS NULL OR f.releaseYear = :releaseYear) AND " +
            "(:language IS NULL OR LOWER(f.language) LIKE LOWER(CONCAT('%', :language, '%')))")
    Page<Films> searchFilms(
            @Param("title") String title,
            @Param("description") String description,
            @Param("releaseYear") Integer releaseYear,
            @Param("language") String language,
            Pageable pageable);
}
