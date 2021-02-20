package day1;

import java.util.Scanner;

public class Prog21_DaysInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		String month=sc.next();
		int year;
		switch(month)
		{
			case "January":
				System.out.println("No of days is 31"); 
				break;
			case "February":
				System.out.println("Enter the year");
				year=sc.nextInt();
				if(isLeapYear(year)==1)
				{
					System.out.println("No of days is 29");
				}
				else 
				{
					System.out.println("No of days is 28");
				}
				break;
			case "March":
				System.out.println("No of days is 31"); 
				break;
			case "April":
				System.out.println("No of days is 30"); 
				break;
			case "May":
				System.out.println("No of days is 31"); 
				break;
			case "June":
				System.out.println("No of days is 30"); 
				break;
			case "July":
				System.out.println("No of days is 31");
				break;
			case "August":
				System.out.println("No of days is 31");
				break;
			case "September":
				System.out.println("No of days is 30"); 
				break;
			case "October":
				System.out.println("No of days is 31");
				break;
			case "November":
				System.out.println("No of days is 30");
				break;
			case "December":
				System.out.println("No of days is 31"); 
				break;
		}
	}
	static int isLeapYear(int year)
	{
		if(((year%4==0) && (year%100!=0)) || (year%400==0))
			return 1;
		return 0;
	}
	
}
