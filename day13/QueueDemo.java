package day13;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>(); 		
		Scanner sc=new Scanner(System.in);
		
		//adding elements into queue
		q.add(1);
		q.add(3);
		q.add(5);
		q.add(12);
		q.add(9);
		
		System.out.println("Queue elements: "+q);
		
		int front = q.peek();
		System.out.println("Element at the front of the queue: "+front);
		
		System.out.println("Total no. of elements in the queue: "+q.size());
		
		//removing the top element from the queue
		if(!q.isEmpty())
		{
			int elem = q.poll();
			System.out.println("Removed element: "+elem);
		}
		else
		{
			System.out.println("Queue is empty");
		}
		System.out.println("Queue elements: "+q);
		
		System.out.println("Total no. of elements in the queue: "+q.size());
		
	}
}
