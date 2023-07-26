package com.alura.screenmatch.domain.movie;

import jakarta.persistence.*;

@Entity
@Table(name="movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer durationInMinutes;
    private Integer releaseYear;
    private String gender;

    public Movie(){}

    public Movie(MovieRegistrationData data){
        this.name = data.name();
        this.durationInMinutes = data.duration();
        this.releaseYear = data.year();
        this.gender = data.gender();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", releaseYear=" + releaseYear +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Long getId() { return id; }

    public String getName() {
        return name;
    }

    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public String getGender() {
        return gender;
    }
}
