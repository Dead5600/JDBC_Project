package demo_database;

import java.sql.*;

public class DemoJdbc1 {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/prathamesh";
		String userName = "root";
		String passWord = "Dead@7066";
		
		try {
			// Registering Driver class by two ways
			//1) by using Class.forName method
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2)  by using DriverManager class
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			//Creating Connection by two ways 
			// 1) by using DriverManager class
			Connection con = DriverManager.getConnection(url,userName,passWord);
			
			/*2) by using ConnectionProvider class
			 * Connection con = ConnectionProvider.getConnection();
			 * */
			if (con.isClosed())
			{
				System.out.println("Connection is not connected.....");
			}
			else
			{
				System.out.println("Connection is ready to Work.....");
			}
			
			// Creating a query
			String q = "create table Institute (InstituteID int(10) primary key, InstituteName varChar(100) not null, City varChar(100))";
			
			// Creating statement
			Statement stmt = con.createStatement();
			
			// Execute Statement
			stmt.executeUpdate(q);
			
			System.out.println("Query is executed");
			
			//  closing the connection
			con.close();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
