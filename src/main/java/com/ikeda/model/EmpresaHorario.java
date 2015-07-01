package com.ikeda.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="empresa_possui_horario")
public class EmpresaHorario {
	@Id
	private String id;
	private String empresa_cnpj;
	private String horario_id;
	private String comeco;
	private String fim;
	private String dia;
	private String status;
	
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmpresa_cnpj() {
		return empresa_cnpj;
	}
	public void setEmpresa_cnpj(String empresa_cnpj) {
		this.empresa_cnpj = empresa_cnpj;
	}
	public String getHorario_id() {
		return horario_id;
	}
	public void setHorario_id(String horario_id) {
		this.horario_id = horario_id;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
