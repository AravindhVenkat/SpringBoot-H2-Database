package com.sprboot.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprboot.demo.dto.Movie;
import com.sprboot.demo.repository.MovieRepository;
@Service
public class MovieServiceImpl implements IMovieService{
	
	@Autowired
	MovieRepository mr;

	@Override
	public Movie addmovie(Movie m) {
		return mr.save(m);
	}

	@Override
	public List<Movie> getmovie() {
		return mr.findAll();
	}

	@Override
	public void delbyid(int mid) {
		mr.deleteById(mid);
	}

	@Override
	public Movie updmovie(Movie m) {
		return mr.save(m);
	}

}
