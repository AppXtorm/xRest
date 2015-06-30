package com.ikeda.jdbc;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SQLSessionFactory {
	protected static final SqlSessionFactory FACTORY;
	
	static{
		try{
			String resource = "Configuration.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);			
			FACTORY = new SqlSessionFactoryBuilder().build(inputStream);
		}
		catch(Exception e){
			throw new RuntimeException(e.toString());
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory(){
		return FACTORY;
	}

}
