package com.example.films.Service;

import com.example.films.Entity.Films;
import com.example.films.Repository.FilmsRepository;
import com.example.films.DTO.FilmsDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FilmsService {
    private final FilmsRepository filmRepository;

    public FilmsService(FilmsRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public Page<FilmsDTO> searchFilms(String title, String description, Integer releaseYear, String language, Pageable pageable) {
        Page<Films> filmsPage = filmRepository.searchFilms(title, description, releaseYear, language, pageable);
        return filmsPage.map(film -> new FilmsDTO(film.getTitle(), film.getDescription(), film.getRating()));  // film.getRating() should be a float here
    }
}
