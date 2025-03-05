package com.example.films.Controller;

import com.example.films.DTO.FilmsDTO;
import com.example.films.Service.FilmsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/films")
public class FilmsController {
    private final FilmsService filmService;

    public FilmsController(FilmsService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/search")
    public Page<FilmsDTO> searchFilms(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) Integer releaseYear,
            @RequestParam(required = false) String language,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return filmService.searchFilms(title, description, releaseYear, language, PageRequest.of(page, size));
    }
}
