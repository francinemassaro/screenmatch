package com.alura.screenmatch.domain.movie;

public class Movie {
    private String name;
    private Integer durationInMinutes;
    private Integer releaseYear;
    private String gender;

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
