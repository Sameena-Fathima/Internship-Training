package day1;

import java.util.Scanner;

public class Prog16_FindOccurrences {
	public static void main(String[] args) {
		int n,count=0,elem,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements"); 
	    n=sc.nextInt();
		int arr[] = new int[n];
		int loc[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element to search:");
		elem=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==elem)
			{
				loc[k++]=i+1;
				count++;
			}
		}
		if(count==0)
			System.out.println(elem+" is not found in the array");
		else
		{
			System.out.println(elem+" has occurred "+count+" times");
			System.out.print("Locations:");
			for(int i=0;i<k;i++)
				System.out.println(loc[i]+" ");
			
		}
	}
}