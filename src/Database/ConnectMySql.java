package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class ConnectMySql {
	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException{
		
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver Loaded");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","Bharath2$");

			System.out.println("Connected to MySQL Database");
			
			Statement smt=con.createStatement();
			
			ResultSet rs=smt.executeQuery("select * from Users");
			while(rs.next())
			{
			  String FirstName=rs.getString("firstname");
			  System.out.println("Database Record is:" +FirstName);
			  
			  String Email=rs.getString("email");
			  System.out.println("Database Record is:" +Email);
			  
			}
	}
 
}
