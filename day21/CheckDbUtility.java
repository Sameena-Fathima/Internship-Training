package day21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CheckDbUtility {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		es.execute(()-> {
			System.out.println(DBUtility.getConnection());
			DBUtility.closeConnection(null);
			System.out.println(DBUtility.getConnection());
		});
		
		es.execute(()-> {
			System.out.println(DBUtility.getConnection());
			System.out.println(DBUtility.getConnection());
		});
	}
}