package day11_labbook;

import java.io.IOException;

public class Prog2 {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	public void mth2() {
		try {
			throw new IOException();
			//return;//unreachable code
		}
		catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally{
			System.out.println("finally-mth2");
		}
	}
	public static void main(String p[])
	{
		Prog2 obj=new Prog2();
		obj.mth1();
	}
}
