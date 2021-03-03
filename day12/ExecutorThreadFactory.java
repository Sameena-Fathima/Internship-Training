package day12;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThreadFactory {
	static Thread t; 
	public static void main(String[] args) {    
		ExecutorService es=Executors.newFixedThreadPool(1,new ThreadFactory() { 
			@Override
			public Thread newThread(Runnable r) {
				t=Executors.defaultThreadFactory().newThread(r);
				t.setName("thread factory thread...");     
				System.out.println("thread...................");
				return t;        
				}   
			});     
		es.execute(()->{
			System.out.println("thread called...........");
		}); 
		System.out.println(t);
	}
}