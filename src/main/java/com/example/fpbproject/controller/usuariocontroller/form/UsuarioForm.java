package com.example.fpbproject.controller.usuariocontroller.form;
import com.example.fpbproject.model.usuario.Usuario;

public class UsuarioForm {
	
	private String username;
	
	private String password;
	

	
	public Usuario converte() {
		Usuario usuario = new Usuario();
		usuario.setUsername(this.getUsername());
		usuario.setPassword(this.getPassword());
		return usuario;
		
	}



	public String getUsername() {
		return username;
	}



	public String getPassword() {
		return password;
	}
	
	
	
	
	
}
