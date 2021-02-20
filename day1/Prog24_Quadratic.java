package day1;

import java.util.Scanner;

public class Prog24_Quadratic {
	private int a,b,c;
	Prog24_Quadratic()
	{
		a=1;
		b=1;
		c=1;
	}
	Prog24_Quadratic(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	int getA()
	{
		return a;
	}
	int getB()
	{
		return b;
	}
	int getC()
	{
		return c;
	}
	public void modify(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public long compute(int x) {
		int res=this.a*(x*x)+this.b*x+this.c;
		return res;
	}
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values for a,b and c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Invoking default construcor");
		Prog24_Quadratic obj=new Prog24_Quadratic();
		System.out.println("values of a,b and c are "+obj.getA()+","+obj.getB()+" and "+obj.getC());
		System.out.println("Invoking parameterized construcor");
		Prog24_Quadratic obj1=new Prog24_Quadratic(a,b,c);
		System.out.println("values of a,b and c are "+obj1.getA()+","+obj1.getB()+" and "+obj1.getC());
		obj.modify(2,6,4);
		System.out.println("Values after modification");
		System.out.println("values of a,b and c are "+obj.getA()+","+obj.getB()+" and "+obj.getC());
		System.out.println("Result after computation: "+obj.compute(3));
	}
}

