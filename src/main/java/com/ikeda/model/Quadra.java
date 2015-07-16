package com.ikeda.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Quadra")
public class Quadra {
	
	@Id
	private long id;
	private String empresa_cnpj;
	private String nome;
	private int status;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmpresa_cnpj() {
		return empresa_cnpj;
	}
	public void setEmpresa_cnpj(String empresa_cnpj) {
		this.empresa_cnpj = empresa_cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}


}
