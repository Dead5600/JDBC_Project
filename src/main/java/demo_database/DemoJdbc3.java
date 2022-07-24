package demo_database;
import java.sql.*;

public class DemoJdbc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/prathamesh";
		String uname = "root";
		String pwd = "Dead@7066";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pwd);
			String q = "insert into college values(?,?,?)";
			
			PreparedStatement pstmt =con.prepareStatement(q) ;
			pstmt.setInt(1,111);
			pstmt.setString(2, "sskb");
			pstmt.setString(3, "Gargoti");
			
			pstmt.executeUpdate();
			
			con.close();
			System.out.println("End of the programme");
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
