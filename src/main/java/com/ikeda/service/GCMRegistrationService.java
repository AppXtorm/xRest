package com.ikeda.service;

import org.apache.ibatis.session.SqlSession;

import com.ikeda.jdbc.SQLSessionFactory;
import com.ikeda.model.Usuario;



public class GCMRegistrationService {
	
	public static String getRegistrationId(String cpf){
		
		String registrationId = "";
		try{
			SqlSession session = SQLSessionFactory.getSqlSessionFactory().openSession();											
			
			
			registrationId =  session.selectOne("getRegistrationId", cpf);
			
			session.commit();
			session.close();									
			
			return registrationId;
			
			}catch(Exception e){
				System.out.println(e);
				return "";
			}		
	}
	
	public static boolean setRegistrationId(Usuario user){
		try{
			
			SqlSession session = SQLSessionFactory.getSqlSessionFactory().openSession();											
			int  registrationUpdated;
			
			registrationUpdated =  session.update("updateRegistrationId", user);
			
			session.commit();
			session.close();
			
			if(registrationUpdated == 1){
				return true;
			}else{
				return false;
			}
			
			}catch(Exception e){
				System.out.println(e);
				return false;
			}			
	}

}
