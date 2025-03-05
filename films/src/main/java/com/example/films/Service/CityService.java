package com.example.films.Service;

import com.example.films.DTO.CityDTO;
import com.example.films.Entity.City;
import com.example.films.Repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<CityDTO> getAllCitiesWithCountries() {
        return cityRepository.findAll().stream()
                .map(city -> new CityDTO(city.getName(), city.getCountry().getName()))
                .collect(Collectors.toList());
    }
}
