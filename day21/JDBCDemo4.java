package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo4 {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ey", "root", "root");
		
		String sql = "select * from users where uid=? and uname=?";
		PreparedStatement pst = con.prepareStatement(sql);
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter user id:");
			int userid = sc.nextInt();
			System.out.println("Enter username:");
			String username = sc.next();
			
			pst.setInt(1, userid);
			pst.setString(2, username);
			ResultSet rs = pst.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int no_of_columns = rsmd.getColumnCount();
			
			for(int i = 1; i <= no_of_columns; i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			
			while(rs.next()) {
				for(int i = 1; i <= no_of_columns; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		
		}
	}
}