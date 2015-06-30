package com.ikeda.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Empresa")
public class Empresa {
	
	@Id
	private String cnpj;
	
	private String cep;
	private String nome;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
