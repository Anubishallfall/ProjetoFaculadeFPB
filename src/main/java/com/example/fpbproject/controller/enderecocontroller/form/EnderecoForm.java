package com.example.fpbproject.controller.enderecocontroller.form;

import com.example.fpbproject.model.endereco.Endereco;

public class EnderecoForm {

	private String rua;

	private String bairro;

	private String cidade;

	private String estado;

	private String pais;

	public Endereco converte() {
		Endereco endereco = new Endereco();
		endereco.setRua(this.getRua());
		endereco.setBairro(this.getBairro());
		endereco.setCidade(this.getCidade());
		endereco.setEstado(this.getEstado());
		endereco.setPais(this.getPais());
		return endereco;

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
