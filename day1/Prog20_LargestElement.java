package day1;

import java.util.Scanner;

public class Prog20_LargestElement {
	public static void main(String[] args) {
		int rows,cols,large_val;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		rows=sc.nextInt();
		System.out.println("Enter the number of columns:");
		cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		System.out.println("Enter the elements");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			large_val=arr[i][0];
			for(int j=1;j<cols;j++)
			{
				if(arr[i][j]>large_val)
					large_val=arr[i][j];
			}
			System.out.println("Largest element in row "+i+" is "+large_val);
		}
				
	}

}
