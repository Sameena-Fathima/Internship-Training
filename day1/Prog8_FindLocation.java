package day1;

import java.util.Scanner;

public class Prog8_FindLocation {
	public static void main(String[] args) {
		int n,loc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements"); 
	    n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element to find its location:");
		int elem=sc.nextInt();
		loc=findLoc(arr,elem);
		if(loc!=-1)
			System.out.println(elem+" is found at the location "+loc);
		else
			System.out.println(elem+" is not found in the array");		
				
	}
	
	static int findLoc(int[] arr,int elem)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==elem)
				return i+1;
				
		}
		return -1;		
	}

}
