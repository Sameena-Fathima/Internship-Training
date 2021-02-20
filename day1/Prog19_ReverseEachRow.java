package day1;

import java.util.Scanner;

public class Prog19_ReverseEachRow {
	public static void main(String[] args) {
		int rows,cols,left,right,temp;
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
		System.out.println("Input 2D array");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<rows;i++)
		{
			left=0;
			right=cols-1;
			while(left<right)
			{
				temp=arr[i][left];
				arr[i][left]=arr[i][right];
				arr[i][right]=temp;
				left++;
				right--;
			}
		}
		System.out.println("Array after reversing each row");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
