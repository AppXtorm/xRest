package com.ikeda.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="horario")
public class Horario {
	@Id
	private int id;
	private String comeco;
	private String fim;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComeco() {
		return comeco;
	}
	public void setComeco(String comeco) {
		this.comeco = comeco;
	}
	public String getFim() {
		return fim;
	}
	public void setFim(String fim) {
		this.fim = fim;
	}
	
	
}
