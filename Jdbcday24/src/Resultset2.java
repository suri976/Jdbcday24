import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;


public class Resultset2 {

	
	
	
	//""
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			String url="jdbc:mysql://localhost:3306/world";
			//jdbc:mysql://localhost:3306/world
			String username="root";
		    String password= "Password@123";
		    
		    try {
				Connection con = DriverManager.getConnection(url, username, password);
				//System.out.println(con);
				//Statement st =con.createStatement();
				String selectsql = "select * from customer";
				Statement st1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = st1.executeQuery(selectsql);
				
				
				
				if(rs.next())
				{
					rs.moveToInsertRow();
					rs.updateString(2,"yankunlee" );
					rs.updateInt(1, 123);
					rs.updateDouble(3, 6789);
					rs.insertRow();
					rs.last();
					System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
					
				}
				
				
				/*
				 * while(rs.next()) { // rs.afterLast();// enter which record to see for to go
				 * fourth record // // rs.previous(); //
				 * System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3))
				 * ; rs.first();
				 * System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3))
				 * ;
				 * 
				 * // rs.next(); //
				 * System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3))
				 * ;
				 * 
				 * //rs.absolute(4);// with reference with first record //
				 * System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3))
				 * ; //rs.next();
				 * 
				 * 
				 * // }
				 */
				
//				rs.afterLast();
//				while(rs.previous()) {
//				   System.out.println(rs.getString(1));
//				   System.out.println(rs.getString(2));
//				}
//				//System.out.println(con);
				
				
				
				
				
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    

		}
}
