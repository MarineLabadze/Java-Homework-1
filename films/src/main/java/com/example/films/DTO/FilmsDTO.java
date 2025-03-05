package com.example.films.DTO;

public class FilmsDTO {
    private String title;
    private String description;
    private float rating;

    public FilmsDTO(String title, String description, float rating) {
        this.title = title;
        this.description = description;
        this.rating = rating;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public float getRating() { return rating; }
}
