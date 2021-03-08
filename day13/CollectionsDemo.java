package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;
class Employee implements Comparable<Employee>{
	String name;
	public Employee(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Name..:"+this.name;
	}
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
}
public class CollectionsDemo {
	public static void main(String[] args) {
//		List<Employee> mylist=new ArrayList<>(10);
//		
//		mylist.add(new Employee("hello"));
//		mylist.add(new Employee("world"));
//		mylist.add(new Employee("moon"));
//		mylist.add(new Employee("mercury"));
		
		List<Employee> mylist=Arrays.asList(new Employee("ramu"),new Employee("somu"),new Employee("raju"),new Employee("ramu"));
		System.out.println(mylist);
		
		System.out.println(mylist);
		System.out.println(mylist.get(1));
		System.out.println(mylist.contains("hello"));
		System.out.println("size..:"+mylist.size());
		int size=mylist.size();
		for(int i=0;i<size;i++) {
			System.out.println(mylist.get(i));
		}
		
		for(Employee s:mylist) {
			System.out.println(s);
		}
		
		Iterator<Employee> iter=mylist.iterator();
		
		while(iter.hasNext()) {
			System.out.println("First...:"+iter.next());
		}
		
		
		iter=mylist.iterator();
		//only if I get the iterator again the next loop will work...
		while(iter.hasNext()) {
			System.out.println("second...:"+iter.next());
		}
		
		ListIterator<Employee> liter=mylist.listIterator();
		
		while(liter.hasNext()) {
			System.out.println("Next....:"+liter.next());
		}
		while(liter.hasPrevious()) {
			System.out.println("Previous...:"+liter.previous());
		}
		
		while(liter.hasNext()) {
			System.out.println("Next..next..:"+liter.next());
		}
		while(liter.hasPrevious()) {
			System.out.println("Previous..previous.:"+liter.previous());
		}
		
		Collections.sort(mylist,(o1,o2)->{return o1.compareTo(o2);});
		System.out.println(mylist);
		
		Stream<Employee> s=mylist.stream();
		
		s.filter((emp)->emp.name.equals("ramu")).forEach(System.out::println);
		
		
	}
}
//class MyComparator implements Comparator<String>{
//	@Override
//	public int compare(String o1, String o2) {
//		return o2.compareTo(o1);
//	}
//}