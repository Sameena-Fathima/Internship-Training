package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Prog7_SortArray {
	public static void main(String[] args)
    {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n"); 
	    n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter all values");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("1.Ascending\n2.Descending");
		System.out.print("Enter value(1 or 2):");
		int choice=sc.nextInt();
		sort(arr,choice);
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]+" ");
    }
		
	static void sort(int[] arr,int choice) {
		int n=arr.length,temp;
		if(choice==1)
		{
			for (int i=0; i<n-1; i++)
			{
				for (int j = 0; j<n-i-1; j++)
				{
					if (arr[j]>arr[j+1])
					{
						temp=arr[j];
						arr[j]=arr[j+1];
	                   	arr[j+1]=temp;
					}
				}
			}
		}
		 else if(choice==2)
		 {
			 for (int i=0;i<n-1;i++)
			 {
				 for (int j=0;j<n-i-1;j++)
				 {
		               if (arr[j]<arr[j+1])
		               {
		                   temp=arr[j];
		                   arr[j] = arr[j+1];
		                   arr[j+1] = temp;
		               }
				 }
			 }
		 }
	}
}
