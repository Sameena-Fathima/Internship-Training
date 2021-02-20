package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Prog6_ResizeArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the array elements");
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The length of original array is "+arr.length);
		arr=Arrays.copyOf(arr, 2);
		System.out.println("The length of modified array is "+arr.length);
	}
}
