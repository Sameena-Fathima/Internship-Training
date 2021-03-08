package day13;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Scanner sc=new Scanner(System.in);
		
		//pushing elements into the stack
		s.push(2);
		s.push(4);
		s.push(6);
		s.push(8);
		s.push(10);
	
		System.out.println("Stack elements: "+s);
		
		int top = s.peek();
		System.out.println("Element at the top of the stack: "+top);
		
		System.out.println("Total no. of elements in the stack: "+s.size());
		
		System.out.println("Enter an element to search in stack");
		int search_elem=sc.nextInt();
		int loc = s.search(search_elem);
		if(loc==-1)
			System.out.println("Element not found");
		else
			System.out.println("Location of "+search_elem+" is "+loc);
		
		//popping the top element from the stack
		if(!s.isEmpty())
		{
			int elem = s.pop();
			System.out.println("Popped element: "+elem);
		}
		else
		{
			System.out.println("Stack is empty");
		}
		System.out.println("Stack elements: "+s);
	}
}