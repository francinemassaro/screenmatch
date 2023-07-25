package com.alura.screenmatch.controller;

import com.alura.screenmatch.domain.movie.Movie;
import com.alura.screenmatch.domain.movie.MovieRegistrationData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class MovieController {

    private List<Movie> movies = new ArrayList<>();

    @GetMapping("/formulario")
    public String loadFormPage(){
        return "movies/form";
    }

    @GetMapping
    public String loadFormList(Model model){
        model.addAttribute("list", movies);
        return "movies/listing";
    }

    @PostMapping
    public String registerMovie(MovieRegistrationData data){
        System.out.println("Filmes registrados no input " + data);

        var movie = new Movie(data);
        movies.add(movie);

        System.out.println("Filmes guardados na lista: \n" + movies);

        //redirect do spring detecta que tem um método get em /filmes, ou seja, ele sabe que vai cair no
        //método get que direciona para a página de listagens
        return "redirect:/filmes";
    }
}
