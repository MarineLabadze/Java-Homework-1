package com.example.films.Repository;

import com.example.films.Entity.Actors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorsRepository extends JpaRepository<Actors, Long> {
}
