package com.ikeda.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ikeda.model.QuadraHorario;

public interface QuadraHorarioMapper {
	static String GET_FIELD_SCHEDULE = "SELECT comeco, fim, status FROM quadra_possui_horarios JOIN horario as h on horario_id = h.id  WHERE empresa_cnpj = #{cnpj}";
	
	
	/* Dado um CNPJ, buscar todos os horários */
	@Select(GET_FIELD_SCHEDULE)
	public List<QuadraHorario> getFieldSchedule(String cnpj) throws Exception;
		
}
