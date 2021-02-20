package day1;

import java.util.Scanner;

public class Prog10_TwoDimensional {
	public static void main(String[] args) {
		int rows,cols,a=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows:");
		rows=sc.nextInt();
		System.out.print("Enter number of columns:");
		cols=sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
