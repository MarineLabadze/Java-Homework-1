package com.example.films.Entity;

import jakarta.persistence.*;

@Entity
public class Actors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @JoinColumn(name = "first_name")
    private String firstName;
    @JoinColumn(name = "last_name")
    private String lastName;

    public Actors() {}

    public Actors(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
