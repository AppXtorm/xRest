package com.ikeda.model;

public enum Status_Quadra {	
	DISPONIVEL(1),
	INDISPONIVEL(2);
	
	private int status;
	
	private Status_Quadra(int status){
		this.status = status;
	}
	
	public int getStatus(){
		return this.status;
	}
	
	public static Status_Quadra getType(int status) {
		
		for(Status_Quadra statusQuadra : Status_Quadra.values()) {
			
			if(statusQuadra.getStatus()==status) {				
				return statusQuadra;
			}
		}
		
		return null;
	}
	

}
