package com.ikeda.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ikeda.model.Empresa;

public interface EmpresaMapper {
	
	static String GET_COMPANIES_BY_CEP = "SELECT * FROM Empresa WHERE cep = #{cep}";
	static String GET_COMPANIES_BY_NAME = "SELECT * FROM Empresa WHERE nome LIKE '%${nome}%' ";
	
	static String CADASTRAR_EMPRESA = "INSERT INTO Empresa (cnpj, nome, cep) VALUES (#{cnpj}, #{nome}, #{cep})";
	
	/* Busca as empresas de um determinado CEP */
	@Select(GET_COMPANIES_BY_CEP)
	public List<Empresa> getEmpresasByCep(String cep) throws Exception;
	
	
	@Insert(CADASTRAR_EMPRESA)
	public int cadastrarEmpresa(Empresa emp) throws Exception;
	
	
	@Select(GET_COMPANIES_BY_NAME)
	public List<Empresa> getCompaniesByName(Empresa emp) throws Exception;
	

}
