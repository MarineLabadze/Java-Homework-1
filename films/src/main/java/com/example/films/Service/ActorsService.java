package com.example.films.Service;

import com.example.films.Entity.Actors;
import com.example.films.DTO.ActorsDTO;
import com.example.films.Repository.ActorsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActorsService {
    private final ActorsRepository actorsRepository;

    public ActorsService(ActorsRepository actorsRepository) {
        this.actorsRepository = actorsRepository;
    }

    public List<ActorsDTO> getAllActors() {
        return actorsRepository.findAll().stream()
                .map(actor -> new ActorsDTO(actor.getFirstName(), actor.getLastName()))
                .collect(Collectors.toList());
    }
}
