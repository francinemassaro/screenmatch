package com.alura.screenmatch.repository;

import com.alura.screenmatch.domain.movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
