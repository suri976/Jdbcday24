import java.util.*;
import java.sql.*;
public class TestJdbc3 {
	
	
	public static void main(String[] args) throws Exception {
		String userName="root";
		String url="jdbc:mysql://localhost:3306/world";
	      String password="Password@123";
		// jdbc:mysql://localhost::3306/	
		
	    //""		
				Connection con= DriverManager.getConnection(url, userName, password);
				System.out.println("Connected to database");
				Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
				//generic -> both ddl,dml,tcl(common,wider)
//				String selectSQL = "Select * from country";
//				//to execute the query by executequery
//				ResultSet rs = st.executeQuery(selectSQL);
//				
//				while(rs.next())//next returns true when a record is found
//				{
//					//System.out.println("data found");
//					System.out.println(rs.getString(1)+" ::"+rs.getString(2) );
//					
//				}
//				
		
	
				String selectSQL = "Select * from customer";
				//to execute the query by executequery
				ResultSet rs = st.executeQuery(selectSQL);
				// ResultSet is Read only and forward only
				
				
				
				
				
				
				//to get the metadata use ResultSetMetaData
	            ResultSetMetaData rsmd = rs.getMetaData();
	            
	            
//	            while(rs.next())
//	            {
//	            	rs.afterLast();// enter which record to see for to go fourth record
//	            	rs.previous();
//	            	System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
//	                rs.first();
//	                System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
//	                rs.next();
//	                System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
//	                rs.absolute(4);// with reference with first record
//	                System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
//	            
//	            
//	            
//	            }
	            
	            
	            
	            
	            //to get type of column 
	            
//	            System.out.println(rsmd.getColumnClassName(1));
//	            System.out.println(rsmd.getColumnClassName(2));
//	            System.out.println(rsmd.getColumnClassName(3));
//	          //to get  column name 
//	            System.out.println(rsmd.getColumnName(1));
//	            System.out.println(rsmd.getColumnName(2));
//	            System.out.println(rsmd.getColumnName(3));
//	            
//	            
//	            System.out.println(rsmd.getColumnType(1));
//	            System.out.println(rsmd.getColumnType(2));
//	            System.out.println(rsmd.getColumnType(3));
//	            
//	            
//	            
//	          //to get  column type
//	            System.out.println(rsmd.getColumnTypeName(1));
//	            System.out.println(rsmd.getColumnTypeName(2));
//	            System.out.println(rsmd.getColumnTypeName(3));
//				
//	            // gives the label 
//	            
//	            System.out.println(rsmd.getSchemaName(1));
//	            System.out.println(rsmd.getCatalogName(1));
//	            System.out.println();
//	            
//	            System.out.println(rsmd.isNullable(1));
//	            System.out.println(rsmd.getPrecision(2));
//	            System.out.println(rsmd.getPrecision(3));
//	            System.out.println(rsmd.getPrecision(1));
//	            System.out.println(rsmd.getScale(1));
//	            
//	            
//	            
	            
	            
	            
	            
	            /*
				 * while(rs.next())//next returns true when a record is found {
				 * System.out.println("data found");
				 * System.out.println(rs.getString(1)+" ::"+rs.getString(2)
				 * +" ::"+rs.getString(3));
				 * 
				 * }
				 */
				
				
		
		
	}
			
}
