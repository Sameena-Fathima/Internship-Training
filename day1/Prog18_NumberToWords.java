package day1;

import java.util.Scanner;

public class Prog18_NumberToWords {
	public static void main(String[] args) {
		int n,rem,rev=0,count=0,temp;
		String res="";
		String[] ones= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] ten_to_nineteen = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen",
			    "nineteen"};
		String[] tens= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=sc.nextInt();
		temp=n;
		while(temp>0)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;	
			count++;
		}
		rem=n%10;
		System.out.println(count);
		if(count==1)
			res=ones[rem];
		else if(n<20)
			res=ten_to_nineteen[rem];
		else if(count==2 || count==3)
		{
			n=rev;
			rem=n%10;
			if(count==2 && (n/10)==0) {
				System.out.println("yes");
				res=tens[rem];}
			else if(count==2)
				res=res+tens[rem]+" "+ones[n/10];
			else
			{
				res=ones[rem]+" hundred ";
				n=n/10;
				rem=n%10;
				res=res+tens[rem]+" ";
				if(n/10!=0)
					res+=ones[n/10];
			}
		}
		System.out.println(res);
		
	}
}
