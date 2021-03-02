package day11_labbook;

import java.util.Scanner;

public class Prog7 {
	public static void main(String[] args) {
		String numerator,denominator;
		int res;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter numerator:");
			numerator=sc.next();
			if(numerator.equals("q") || numerator.equals("Q"))
				break;
			System.out.println("Enter denominator:");
			denominator=sc.next();
			try {
				res=Integer.parseInt(numerator)/Integer.parseInt(denominator);
				System.out.println(res);
			}
			catch(ArithmeticException e) {
				System.out.println("division by zero not allowed");
			}
			catch(NumberFormatException e) {
				System.out.println("Poor Input");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}