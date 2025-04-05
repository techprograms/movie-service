package com.gpr.movie_service.dto;

import com.gpr.movie_service.domain.Genre;

public record MovieDto(Integer id,
                       String title,
                       Integer releaseYear,
                       Genre genre) {
}
