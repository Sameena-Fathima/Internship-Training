package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JDBCDemo3 {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ey", "root", "root");
		
		Statement st = con.createStatement();
		
		String sql = "select * from users";
		
		ResultSet rs = st.executeQuery(sql);
		
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
//			System.out.print(rs.getInt(1) + "\t");
//			System.out.print(rs.getString(2) + "\t");
//			System.out.print(rs.getString("upass") + "\t");
//			System.out.print(rs.getInt("flag") + "\n");
		}
	}
}