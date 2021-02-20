package day1;

import java.util.Scanner;

public class Prog15b_CheckNumber {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number"); 
	    n=sc.nextInt();
		if(isArmstrong(n)==1)
			System.out.println(n+" is an armstong number");
		else if(isPerfect(n)==1)
			System.out.println(n+" is a perfect number");
		else if(isPalindrome(n)==1)
			System.out.println(n+" is a palindrome");
		else
			System.out.println(n+" is not an armstrong number,perfect number and palindrome");
	}
	
	static int isArmstrong(int n)
	{
		int rem,sum=0,temp=n;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(n==sum)
			return 1;
		return 0;	
	}
	static int isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			return 1;
		return 0;
	}
	static int isPalindrome(int n)
	{
		int rev=0,temp=n,rem;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(temp==rev)
			return 1;
		return 0;
	}

}
