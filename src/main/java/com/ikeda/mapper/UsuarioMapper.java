package com.ikeda.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ikeda.model.Usuario;

public interface UsuarioMapper {
	static String CADASTRAR_USUARIO = "INSERT INTO Pessoa (firstName, lastName, cpf, password, registrationid) VALUES (#{firstName}, #{lastName}, #{cpf}, #{password}, #{registrationid})";
	static String SELECT_USUARIO_BY_CPF = "SELECT * FROM Pessoa WHERE cpf = #{cpf}";
	static String SELECT_TODOS_USUARIOS = "SELECT * FROM Pessoa";
	static String UPDATE_REGISTRATION_ID = "UPDATE Pessoa SET registrationid = #{registrationid} WHERE cpf = #{cpf}";
	static String GET_REGISTRATION_ID = "SELECT registrationid FROM Pessoa where cpf = #{cpf}";
	
	@Select(SELECT_USUARIO_BY_CPF)
	public Usuario getUserByCPF(String cpf) throws Exception;

	@Select(CADASTRAR_USUARIO)
	public int registerNewUser(Usuario user) throws Exception;
	
	@Select(SELECT_TODOS_USUARIOS)
	public List<Usuario> getUsers(Usuario user) throws Exception;
	
	@Select(GET_REGISTRATION_ID)
	public String getRegistrationId(Usuario user) throws Exception;
	
	@Update(UPDATE_REGISTRATION_ID)
	public int updateRegistrationId(String registrationid, String cpf) throws Exception;
	
	
	
}
