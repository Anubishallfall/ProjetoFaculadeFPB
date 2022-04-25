package com.example.fpbproject.model.usuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Usuario {
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "usuario_seq")
	@SequenceGenerator(name="usuario_seq", sequenceName = "usuario_seq", allocationSize=1)
	private Long id;
	
	private String username;
	
	private String password;

	
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
