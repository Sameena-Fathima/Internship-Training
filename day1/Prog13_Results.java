package day1;

import java.util.Scanner;

public class Prog13_Results {
	public static void main(String[] args) {
		int rows,cols;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		rows=sc.nextInt();
		System.out.println("Enter the number of subjects:");
		cols=sc.nextInt();
		int marks[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			System.out.println("Enter the marks of student "+(i+1));
			for(int j=0;j<cols;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		calculateTotal(marks,rows,cols);
	}
	
	static void calculateTotal(int[][] marks,int students,int subjects)
	{
		int sum;
		for(int i=0;i<students;i++)
		{
			sum=0;
			for(int j=0;j<subjects;j++)
			{
				sum=sum+marks[i][j];
			}
			System.out.println("Total marks of student "+(i+1)+" is "+sum);
		}
	}
	

}
