package com.example.films.Controller;

import com.example.films.DTO.ActorsDTO;
import com.example.films.Service.ActorsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorsController {
    private final ActorsService actorsService;

    public ActorsController(ActorsService actorsService) {
        this.actorsService = actorsService;
    }

    @GetMapping("/all")
    public List<ActorsDTO> getAllActors() {
        return actorsService.getAllActors();
    }
}
