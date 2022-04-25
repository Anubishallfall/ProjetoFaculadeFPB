package com.example.fpbproject.controller.filmecontroller.dto;

import com.example.fpbproject.model.cinema.Cinema;
import com.example.fpbproject.model.filme.Filme;

public class FilmeDto {

	private Long id;

	private String nome;

	private String descricao;

	private String imagem;

	private Cinema cinema;

	public FilmeDto() {
		super();
	}
	
	
	public FilmeDto(Filme filme) {
		super();
		this.id = filme.getId();
	    this.nome = filme.getNome();
	    this.descricao = filme.getDescricao();
	    this.imagem = filme.getImagem();
	    this.cinema = filme.getCinema();
	    
	}


	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public String getImagem() {
		return imagem;
	}


	public Cinema getCinema() {
		return cinema;
	}

	
	
	
	
}
