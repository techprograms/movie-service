package com.gpr.movie_service.repository;

import com.gpr.movie_service.domain.Genre;
import com.gpr.movie_service.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findByGenre(Genre genre);

}
