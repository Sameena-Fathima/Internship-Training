package day1;

import java.util.Scanner;

public class Prog9_Reverse {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n"); 
	    n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		reversearray(arr,n);
		System.out.println("Reversed array:");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" ");
	}
	
	static void reversearray(int[] arr,int n)
	{
		int l=0,r=n-1,temp;
		while(l<r)
		{
			temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}  
        	
	}	

}
