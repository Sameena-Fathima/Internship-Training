package day21;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JDBCDemo1 {
	public static void main(String[] args) throws Exception{
		//1.Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ey", "root", "root");
		System.out.println(con);
		
		DatabaseMetaData dbmd=con.getMetaData();
		
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDatabaseProductVersion());
		System.out.println(dbmd.getURL());
		System.out.println(dbmd.supportsTransactions());
		System.out.println(dbmd.getDriverVersion());
		
}
}
