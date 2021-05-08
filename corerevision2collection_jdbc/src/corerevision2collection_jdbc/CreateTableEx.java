package corerevision2collection_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try {
			
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
					"jdbc:oracle:thin:@localhost:1521:xe","Archana","archana");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			
			
			String query = "CREATE TABLE customer22("
			         + "ID INT NOT NULL, "
			         + "NAME VARCHAR (20) NOT NULL, "
			         + "AGE INT NOT NULL, "
			         + "SALARY DECIMAL (18, 2), "
			         + "ADDRESS CHAR (25) , "
			         + "PRIMARY KEY (ID))";
			 stmt.execute(query);
			
			
			//step5 close the connection object  
			con.close();  
			  
		
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  

	}

}
