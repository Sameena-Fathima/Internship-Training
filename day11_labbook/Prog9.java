package day11_labbook;

import java.util.Scanner;

public class Prog9 {

	public static void main(String[] args) throws Exception {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter the mark for student "+i+" ");
			n=sc.nextInt();
			try {
				if(n<0){
					throw new MyException3("Please enter a positive integer only");
				}
				if(n>100) {
					throw new MyException3("Please enter a value in the range 0-100");
				}
				sum=sum+n;
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter only valid integer");
				i--;
			}
			catch(MyException3 me)
			{
				System.out.println(me);
				i--;
			}
		}
		System.out.println("Average is: "+(sum/10));
	}
}

class MyException3 extends Exception{
	String msg;
	public MyException3(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return "Exception: "+msg;
	}
}
