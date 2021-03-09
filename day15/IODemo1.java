package day15;

import java.io.FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class IODemo1{
	public static void main(String[] args) {
		new CopyCommand().copy("abc.properties");
	}
}

class CopyCommand { 
	public void copy(String filename) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		FileReader read = null;
		//FileWriter writer = null;
		try(FileWriter writer = new FileWriter("copyabc.properties")){ //Try Resource block-no need to close the writer object now
			//fis = new FileInputStream(filename);
			//fos = new FileOutputStream("copyabc.properties");
			read = new FileReader(filename);
			//writer = new FileWriter("copyabc.properties");
			int letter;
			int noOfCharRead;
			//byte b[] = new byte[8];
			char c[] = new char[8];
			while((noOfCharRead = read.read(c))!=-1) {
				String s = new String(c,0,noOfCharRead);
				System.out.println(s);
				System.out.println("loop runs");
				writer.write(c, 0, noOfCharRead);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				//fis.close();
				//fos.close();
				//read.close();
				//writer.close();
			}
			catch(Exception ee){
				ee.printStackTrace();
			}
		}
	}
}