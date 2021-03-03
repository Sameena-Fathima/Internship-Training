package day12;

public class ThreadDemo2 {
	public static void main(String[] args) {
		System.out.println("first line....code");
//		 new Thread(new Runnable() {
//		 @Override
//		 public void run() {
//		 met();
//		 }
//		 }).start();
		new Thread(()->{
			met();
		});
		System.out.println("third line code....");
	}
	public static void met() {
		try{
			Thread.sleep(5000);
		}catch(Exception e) {
			
		}
		System.out.println("second line....code");
	}
	
}
