package day11_labbook;

import java.util.Scanner;

public class Prog8 {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter the mark for student "+i+" ");
			n=sc.nextInt();
			try {
				sum=sum+n;
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter only valid integer");
				i--;
			}
		}
		System.out.println("Average is: "+(sum/10));
	}
}