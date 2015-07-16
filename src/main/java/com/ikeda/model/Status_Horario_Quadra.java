package com.ikeda.model;

public enum Status_Horario_Quadra {
	DISPONIVEL(1),
	RESERVADO(2),
	FIXO(3),
	CONFIRMADO(4);
	
	private int status;
	
	private Status_Horario_Quadra(int status){
		this.status = status;
	}
	
	public int getStatus(){
		return this.status;
	}
	
	public static Status_Horario_Quadra getType(int status) {
		
		for(Status_Horario_Quadra statusQuadra : Status_Horario_Quadra.values()) {
			
			if(statusQuadra.getStatus()==status) {				
				return statusQuadra;
			}
		}
		
		return null;
	}
	
}
