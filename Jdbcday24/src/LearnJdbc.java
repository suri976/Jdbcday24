
import java.sql.*;

public class LearnJdbc {
    // connect
	// send and retreive the select statement
	//dml
	//get information from database 
	//resultset
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String userName="root";
	      String url="jdbc:mysql://localhost:3306/world";
	      String password="Password@123";
	    //""
	      // 1. establish connection 
	      Connection con= DriverManager.getConnection(url, userName, password);
			System.out.println("Connected to database");
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String selectSQL = "Select * from customer";
			//to execute the query by executequery
			ResultSet rs = st.executeQuery(selectSQL);
			// ResultSet is Read only and forward only
			
			
			
			
			
			
			//to get the metadata use ResultSetMetaData
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
//            while(rs.next())
//            {
//            	rs.afterLast();// enter which record to see for to go fourth record
//            	rs.previous();
//            	System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
//                rs.first();
//                System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
//                rs.next();
//                System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
//                rs.absolute(4);// with reference with first record
//                System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
//            
//            
//            
//            }
			
			
			
			
			
			
			
			
			
			
			
			
         }

}
