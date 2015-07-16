package com.ikeda.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.ikeda.model.Quadra;

public interface QuadraMapper {
	
	static String REGISTER_FIELD = "INSERT INTO quadra (nome, empresa_cnpj, status) VALUES(#{nome}, #{empresa_cnpj}, #{status})";
	static String GET_AVAILABLE_FIELDS = "SELECT * FROM quadra WHERE status=1 AND empresa_cnpj = #{cnpj}";
	
	@Insert(REGISTER_FIELD)
	public int registerField(Quadra quadra);
	
	/* BUSCAR QUADRAS DISPONIVEIS DE UMA EMPRESA*/
	@Select(GET_AVAILABLE_FIELDS)
	public List<Quadra> getAvailableFields(String cnpj);
	
	

}
