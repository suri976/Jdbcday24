package com.practise.jdbc;
import java.util.*;
import java.sql.*;
public class PractiseJdbc {

	
	//" "
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/world";
		//jdbc:mysql://localhost:3306/world
		String username="root";
	    String password= "Password@123";
	    
	    Connection con = DriverManager.getConnection(url, username, password);
 String sql="create table ta (id int not null,name varchar(225),primary key(id))   ";
	   // String sql="select * from customer ";
	    
	    Statement st = con.createStatement();
	    ResultSet re = st.executeQuery(sql);
	    
	    while(re.next())
	    {
	    	System.out.println(re.getString(1));
	    }
	    
	   
	    

	}

}
