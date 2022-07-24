package demo_database;
import java.io.*;
import java.sql.*;
public class DemoJdbc7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/prathamesh";
		String uname = "root";
		String pwd = "Dead@7066";
		
		try {
			Connection con = DriverManager.getConnection(url,uname,pwd);
			String q = "Update demoDb set username =?, tableNo = ? where userId =?";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter usernme :");
			String username = br.readLine();
			
			System.out.println("Enter No of tables :");
			int tableNo = Integer.parseInt(br.readLine());
			
			System.out.println("Enter userId :");
			int userId = Integer.parseInt(br.readLine());
			
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, username);
			pstmt.setInt(2, tableNo);
			pstmt.setInt(3, userId);
			
			pstmt.executeUpdate();
			System.out.println("query executed........");
			
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
