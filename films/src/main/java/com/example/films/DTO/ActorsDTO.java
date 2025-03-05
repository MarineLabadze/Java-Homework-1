package com.example.films.DTO;

public class ActorsDTO {
    private String firstName;
    private String lastName;

    public ActorsDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
