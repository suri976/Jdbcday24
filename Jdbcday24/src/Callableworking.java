import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class Callableworking {

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
			
			/*
			 * CallableStatement cs = con.prepareCall("{ call updateBalance(?,?)}");
			 * cs.setInt(1, 101); cs.setDouble(2, 5000); cs.execute();
			 */
			
			CallableStatement f = con.prepareCall(selectsql);
			
			 f.execute();
			
			
			//dynamic
			
			
			
			/*
			 * CallableStatement cs1 = con.prepareCall("{ call updatetitle(?,?)");
			 * cs1.setInt(1, 101); cs1.setString(2,"RamboRocks" ); cs1.execute();
			 */
			 //System.out.println(rs.getInt(1)+"::"+rs.getString(2)+"::"+rs.getDouble(3));
			
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

