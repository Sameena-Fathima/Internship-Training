package day1;

import java.util.Scanner;

public class Prog11_TwoDimensionalTriangular {
	public static void main(String[] args) {
		int rows,a=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows:");
		rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		
	}

}
