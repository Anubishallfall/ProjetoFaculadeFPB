package com.example.fpbproject.controller.usuariocontroller.dto;

import com.example.fpbproject.model.usuario.Usuario;

public class UsuarioDto {

	private Long id;

	private String username;

	private String password;

	public UsuarioDto() {
		super();
	}

	public UsuarioDto(Usuario usuario) {
		super();
		this.id = usuario.getId();
		this.username = usuario.getUsername();
		this.password = usuario.getPassword();

	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
