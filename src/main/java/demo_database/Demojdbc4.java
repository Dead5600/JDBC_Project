package demo_database;
import java.sql.*;

public class Demojdbc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/prathamesh";
		String uname = "root";
		String pwd = "Dead@7066";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pwd);
			String q = "Select * from college";
			Statement stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(q);
			
			System.out.println("\tCollegeId \tCollegeName \tCity ");
			while(rset.next())
			{
				int id = rset.getInt(1);
				String name = rset.getString(2);
				String city = rset.getString(3);
			System.out.println("\t   "+id + "\t\t  "+name +"\t\t"+city);
			}
			
			con.close();
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
