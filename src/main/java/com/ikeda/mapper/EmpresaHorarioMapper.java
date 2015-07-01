package com.ikeda.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ikeda.model.EmpresaHorario;

public interface EmpresaHorarioMapper {
	static String GET_COMPANY_SCHEDULE = "SELECT empresa_cnpj, comeco, fim, status FROM empresa_possui_horario JOIN horario as h on horario_id = h.id  WHERE empresa_cnpj = #{cnpj}";
	
	
	/* Dado um CNPJ, buscar todos os horários */
	@Select(GET_COMPANY_SCHEDULE)
	public List<EmpresaHorario> getCompanySchedule(String cnpj) throws Exception;

}
