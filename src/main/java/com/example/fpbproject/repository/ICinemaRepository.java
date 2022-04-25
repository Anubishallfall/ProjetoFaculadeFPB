package com.example.fpbproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fpbproject.model.cinema.Cinema;

public interface ICinemaRepository  extends JpaRepository<Cinema, Long>{

}


