package com.gpr.movie_service.controller;

import com.gpr.movie_service.domain.Genre;
import com.gpr.movie_service.dto.MovieDto;
import com.gpr.movie_service.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    public List<MovieDto> getAll() {
        return this.service.getAll();
    }

    @GetMapping("{genre}")
    public List<MovieDto> getAllByGenre(@PathVariable Genre genre) {
        return this.service.getAll(genre);
    }

}