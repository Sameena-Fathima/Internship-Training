package day1;

import java.util.Scanner;

public class Prog5_Average {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);     
		int n;
		System.out.print("Enter a number:"); 
	    n=sc.nextInt();
		System.out.println("Average is "+calcavg(n));
	     
	}
	
	static float calcavg(int n)
	{
		int sum=0;
		float avg;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		avg=sum/n;
		return avg;
	}
	
}

