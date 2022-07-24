package demo_database;
import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class DemoJdbc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:mysql://localhost:3306/prathamesh";
		String uname = "root";
		String pwd = "Dead@7066";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pwd);
			String q = "insert into demoDb(username,tableNo) values (?,?);";
			PreparedStatement pstmt = con.prepareStatement(q);
			
			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Enter username");
			String username = br.readLine();
			
			/* we can insert int value by two ways
			 * by using scanner class
			 */
			System.out.println("Enter no. of tables");
			int tableNo = sc.nextInt();
			
			//int tableNo = Integer.parseInt(br.readLine());
			
			
			pstmt.setString(1, username);
			pstmt.setInt(2, tableNo);
			pstmt.executeUpdate();
			
			System.out.println("inserted......");
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
