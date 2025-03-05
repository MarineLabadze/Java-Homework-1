package com.example.films.Controller;

import com.example.films.DTO.CityDTO;
import com.example.films.Service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/all")
    public List<CityDTO> getAllCitiesWithCountries() {
        return cityService.getAllCitiesWithCountries();
    }
}
