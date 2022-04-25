package com.example.fpbproject.model.cinema;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.example.fpbproject.model.endereco.Endereco;
import com.example.fpbproject.model.filme.Filme;
import com.example.fpbproject.model.usuario.Usuario;

@Entity
public class Cinema {
  
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "cinema_seq")
	@SequenceGenerator(name="cinema_seq", sequenceName = "cinema_seq", allocationSize=1)
	private Long id;
	
	private String nome;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id", referencedColumnName = "id")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "cinema")
	private List<Filme> filmes;

	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
