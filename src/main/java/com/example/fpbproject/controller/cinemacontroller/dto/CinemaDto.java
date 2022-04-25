package com.example.fpbproject.controller.cinemacontroller.dto;

import com.example.fpbproject.controller.enderecocontroller.dto.EnderecoDto;
import com.example.fpbproject.controller.usuariocontroller.dto.UsuarioDto;
import com.example.fpbproject.model.cinema.Cinema;

public class CinemaDto {

	private Long id;

	private String nome;

	private EnderecoDto endereco;

	private UsuarioDto usuario;

	public CinemaDto(Cinema cinema) {
		super();
		this.id = cinema.getId();
		this.nome = cinema.getNome();
		this.endereco = new EnderecoDto(cinema.getEndereco());
		this.usuario = new UsuarioDto(cinema.getUsuario());

	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public EnderecoDto getEndereco() {
		return endereco;
	}

	public UsuarioDto getUsuario() {
		return usuario;
	}

}
