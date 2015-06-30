package com.ikeda.service;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.ikeda.jdbc.SQLSessionFactory;
import com.ikeda.model.Empresa;

public class EmpresaService {

	public static List<Empresa> getEmpresasByCep(String cep){
		
		try{
			SqlSession session = SQLSessionFactory.getSqlSessionFactory().openSession();
		
			List<Empresa> empresas = session.selectList("getEmpresasByCep", cep);
		
			session.commit();
			session.close();
		
			return empresas;
		}catch(Exception e){
			System.out.println(e);
			return null;
		}
		
	}
	
	public static Boolean registerCompany(Empresa empresa) {
		int inserted;
		try {
			SqlSession session = SQLSessionFactory.getSqlSessionFactory().openSession();
			inserted = session.insert("cadastrarEmpresa", empresa);
			session.commit();
			session.close();
			
			if (inserted == 1) {
				return true;
			} else
				return false;
			
		} catch (Exception e) {
			System.out.println("EmpresaService: " + e);
			return false;
		}
		
	}
}
