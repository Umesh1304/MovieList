package com.umiprojs.movies.dataaccess;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umiprojs.movies.model.Movie;

public interface MovieListRepository extends JpaRepository<Movie, Long>{
	
	List<Movie> findMoviesByActor(String name);

}