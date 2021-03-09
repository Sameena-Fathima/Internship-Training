package day15;

import java.io.PipedReader;
import java.io.PipedWriter;
public class IODemo6 {
	public static void main(String[] args) throws Exception{
		 PipedReader reader=new PipedReader();
		 PipedWriter writer=new PipedWriter(reader);
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					int data=reader.read();
					while(data!=-1) {
						System.out.print((char)data);
						data=reader.read();
					}
					System.out.println();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						writer.write("I love my country".toCharArray());
						try {Thread.sleep(1000);}catch(Exception e) {							
						}
						System.out.println();
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
		
	}
}