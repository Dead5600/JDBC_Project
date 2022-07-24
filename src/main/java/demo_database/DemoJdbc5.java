package demo_database;
import java.sql.*;

public class DemoJdbc5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/prathamesh";
		String uname = "root";
		String password = "Dead@7066";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, password);
			String q = "Create table DemoDb (userId int(10) primary Key auto_increment, username varChar(100),tableNo int(20))";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table is created");
			con.close();
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
