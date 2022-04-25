package com.example.fpbproject.controller.cinemacontroller.form;

import com.example.fpbproject.controller.enderecocontroller.form.EnderecoForm;
import com.example.fpbproject.controller.usuariocontroller.form.UsuarioForm;
import com.example.fpbproject.model.cinema.Cinema;

public class CinemaForm {

	private String nome;

	private EnderecoForm endereco;

	private UsuarioForm usuario;

	public Cinema converte() {
		Cinema cinema = new Cinema();
		cinema.setNome(this.getNome());
		cinema.setEndereco(this.getEndereco().converte());
		cinema.setUsuario(this.getUsuario().converte());
		return cinema;

	}

	public String getNome() {
		return nome;
	}

	public EnderecoForm getEndereco() {
		return endereco;
	}

	public UsuarioForm getUsuario() {
		return usuario;
	}

}
