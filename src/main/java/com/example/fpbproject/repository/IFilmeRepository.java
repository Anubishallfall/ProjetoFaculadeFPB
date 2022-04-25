package com.example.fpbproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.fpbproject.model.filme.Filme;

public interface IFilmeRepository   extends JpaRepository<Filme, Long>{

}


