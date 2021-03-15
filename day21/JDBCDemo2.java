package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo2  {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ey", "root", "root");
		
		Statement st=con.createStatement();
		String sql="insert into users values(3,'Sierrra','hello',0)";
		
		int no_of_rows_inserted=st.executeUpdate(sql);
		System.out.println(no_of_rows_inserted);
		
		sql="update users set flag=1";
		boolean b=st.execute(sql);
		System.out.println("The query returned resultset: "+b);
	}
}
