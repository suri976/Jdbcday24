import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class ResultSetDelete {
	
	
	//" "
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
		//******oltp		
				
				if(rs.next())
				{
					rs.absolute(11);
					rs.deleteRow();// after deletion the pointer moves to up row
					 System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
				}
				// ****important to write in this way......... 
				 System.out.println(rs.getInt(1)+"::"+rs.getString(2)+"::"+rs.getDouble(3));
				
				/*
				 * while(rs.next()) { //
				 * System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3))
				 * ;
				 * 
				 * 
				 * 
				 * // }
				 */
				
				

				
				
				
				
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		}
	
	
	
	

}
