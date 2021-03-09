package day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class IODemo7 {
	public static void main(String[] args)throws Exception {
		Laddu laddu=new Laddu();
		System.out.println("size of original laddu...:"+laddu.size);
		
		
		laddu.size=8;
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("laddu.dat"));
		oos.writeObject(laddu);
		
		laddu.size=5;
		
		System.out.println("Now the size of laddu is...:"+laddu.size);
		
		System.out.println("i want the old laddu....");
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("laddu.dat"));
		Laddu laddu2=(Laddu)ois.readObject();//its also deep copy...
		
		System.out.println("Original laddu...:"+laddu2.size);
		System.out.println("modified laddu....:"+laddu.size);
		
	}
}
class Laddu implements Serializable{
	public Laddu() {
		System.out.println("laddu object created...");
	}
	int size=10;
}