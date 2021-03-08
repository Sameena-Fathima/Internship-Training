package day13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args)throws Exception {
		ExecutorService es=Executors.newFixedThreadPool(1);
		Future<String> future=es.submit(new MyCallable());
		String result=future.get();
		System.out.println(result);
		es.shutdown();
	}
}
class MyCallable implements Callable<String>{
		@Override
		public String call() throws Exception {
			try {
				Thread.sleep(5000);
			}catch(Exception e) {
				
			}
			return "hello world...";
		}
}
