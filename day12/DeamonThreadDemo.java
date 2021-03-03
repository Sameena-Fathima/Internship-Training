package day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeamonThreadDemo {
	public DeamonThreadDemo() {     
		//     new Thread(new Runnable() { 
		//        @Override
		//        public void run() {
		//           while(true) {
		//              System.out.println("child thread..........");
		//           }
		//        }
		//     }).start();    
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(()->{
			while(true) { 
				System.out.println("child thread....");
				}      
			});    
		}
	public static void main(String[] args) { 
		new DeamonThreadDemo();      
		System.out.println("main thread started....");       
		//Thread.currentThread().setDaemon(true);
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {}  
		System.exit(1);    
	} 
}

