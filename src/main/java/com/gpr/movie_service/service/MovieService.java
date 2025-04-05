package com.gpr.movie_service.service;

import com.gpr.movie_service.domain.Genre;
import com.gpr.movie_service.dto.MovieDto;
import com.gpr.movie_service.mapper.EntityDtoMapper;
import com.gpr.movie_service.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<MovieDto> getAll() {
        return this.repository.findAll()
                .stream()
                .map(EntityDtoMapper::toDto)
                .toList();
    }

    public List<MovieDto> getAll(Genre genre) {
        return this.repository.findByGenre(genre)
                .stream()
                .map(EntityDtoMapper::toDto)
                .toList();
    }

}
