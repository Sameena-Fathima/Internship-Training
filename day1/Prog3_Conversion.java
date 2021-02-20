package day1;

public class Prog3_Conversion {
	public static void main(String[] args) {
		byte b=20;
		short s=5;
		int i=100;
		char ch='a';
		float f=1.2f;
		long l=12345;
		double d=9.8;	
		System.out.println("Implicit conversion");
		int i1=s;
		double d1=f;	
		System.out.println("short to integer:"+i1);
		System.out.println("float to double:"+d1);
		System.out.println("Explicit conversion");
        float f1=(float)d;
        byte b1=(byte)s;
        System.out.println("double to float:"+f1);
        System.out.println("short to byte:"+b1);
	}

}
