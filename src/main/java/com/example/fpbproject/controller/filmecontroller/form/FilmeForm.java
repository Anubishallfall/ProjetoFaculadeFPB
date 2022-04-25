package com.example.fpbproject.controller.filmecontroller.form;

import com.example.fpbproject.controller.cinemacontroller.form.CinemaForm;
import com.example.fpbproject.model.cinema.Cinema;
import com.example.fpbproject.model.filme.Filme;

public class FilmeForm {

	
	private String nome;
	
	private String descricao;
	
	private String imagem;
	
	private CinemaForm cinema;
	
	
	
	public Filme converte(Cinema cinema) {
		Filme filme = new Filme();
		filme.setNome(this.getNome());
		filme.setDescricao(this.getDescricao());
		filme.setImagem(this.getImagem());
		filme.setCinema(cinema);
		return filme;
		
	}
	
	

	public String getDescricao() {
		return descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public CinemaForm getCinema() {
		return cinema;
	}

	public String getNome() {
		return nome;
	}
	
	
	
}
