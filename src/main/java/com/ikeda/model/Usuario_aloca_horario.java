package com.ikeda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="pessoa_aloca_horario")
public class Usuario_aloca_horario {
	
	@Id
	private int id;
	
	/* FK para usuário */
	@Column(name="pessoa_cpf")
	private String usuario_cf;
	
	private String quadra_possui_horario_id;
	private String dia;
	private int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario_cf() {
		return usuario_cf;
	}
	public void setUsuario_cf(String usuario_cf) {
		this.usuario_cf = usuario_cf;
	}
	public String getQuadra_possui_horario_id() {
		return quadra_possui_horario_id;
	}
	public void setQuadra_possui_horario_id(String quadra_possui_horario_id) {
		this.quadra_possui_horario_id = quadra_possui_horario_id;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
