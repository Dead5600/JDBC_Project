package demo_database;

import java.sql.*;

public class DemoJdbc2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/prathamesh";
		String uName = "root";
		String pwd = "Dead@7066";
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uName, pwd);
			String q = "insert into college values(1,'GCG', 'Kolhapur')";
			Statement stmt = con.createStatement();
			
			int x = stmt.executeUpdate(q);
			System.out.println(x);
			
			con.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
