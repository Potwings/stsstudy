package org.potwings.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;

@Component
public class TimeDAO {
	
	public String getTime() throws Exception{
	
	String DBTime =null;
		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	try(
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@112.169.196.210:1523:XE","dclub","dclub");
		PreparedStatement pstmt = con.prepareStatement("select sysdate from dual");
		ResultSet rs = pstmt.executeQuery();
			){
		
		rs.next();
		DBTime = rs.getString(1);
		
		System.out.println(DBTime);
		
	
		
	}catch (Exception e) {
		// TODO: handle exception
	}
	return DBTime;
	}	

}
