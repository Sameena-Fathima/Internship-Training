package day13;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkAndJoinDemo {
	public static void main(String[] args) {
		int count=0;
		MyStringArray msa=new MyStringArray();
		for(String s:msa.arr) {
		System.out.println(s);
		if(s.equals("ramu")) {
		count++;
		}
	}
	System.out.println("Number of ramus are...:"+count);
	ForkJoinPool fjPool=ForkJoinPool.commonPool();
	OurTask task1=new OurTask(0,3,msa.arr,"ramu");
	OurTask task2=new OurTask(3,6,msa.arr,"ramu");
	OurTask task3=new OurTask(6,8,msa.arr,"ramu");
	OurTask task4=new OurTask(8,10,msa.arr,"ramu");
	int result1=fjPool.invoke(task1);
	int result2=fjPool.invoke(task2);
	int result3=fjPool.invoke(task3);
	int result4=fjPool.invoke(task4);
	int finalresult=result1+result2+result3+result4;
	System.out.println("Number of ramus....in array is...:"+finalresult);
	}
}
class OurTask extends RecursiveTask<Integer>{
	int startPosition;
	int endPosition;
	String array[];
	String searchElement;
	public OurTask(int startPosition,int endPosition,String	array[],String searchElement) {
		this.startPosition=startPosition;
		this.endPosition=endPosition;
		this.array=array;
		this.searchElement=searchElement;
	}
	@Override
	protected Integer compute() {
		int count=0;
		for(int i=startPosition;i<endPosition;i++) {
			if(array[i].equalsIgnoreCase(searchElement)) {
				count++;
			}
		}
		return count;
	}
}
class MyStringArray{
	String arr[]={"ramu","somu","monu","nikki","ramu","maggi","khader","refayi","ramu",
		"mokarram"};
}
