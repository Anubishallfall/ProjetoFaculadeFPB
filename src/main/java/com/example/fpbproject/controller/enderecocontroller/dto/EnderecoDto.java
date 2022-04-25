package com.example.fpbproject.controller.enderecocontroller.dto;

import com.example.fpbproject.model.endereco.Endereco;

public class EnderecoDto {

	private Long id;

	private String rua;

	private String bairro;

	private String cidade;

	private String estado;

	private String pais;

	public EnderecoDto() {
		super();
	}

	public EnderecoDto(Endereco endereco) {
		super();
		this.id = endereco.getId();
		this.cidade = endereco.getCidade();
		this.bairro = endereco.getBairro();
		this.cidade = endereco.getCidade();
		this.estado = endereco.getEstado();
		this.pais = endereco.getPais();
	}

	public Long getId() {
		return id;
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getPais() {
		return pais;
	}

}
