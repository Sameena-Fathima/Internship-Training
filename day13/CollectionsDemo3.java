package day13;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo3 {
	public static void main(String[] args) {
		Set<String> myset=new TreeSet<String>((o1,o2)->{return o2.compareTo(o1);});
		myset.add("hello");
		myset.add("world");
		myset.add("hello");
		myset.add("mani");
		myset.add("abdul");
		myset.add("zubi");
		System.out.println(myset);
		for(String s:myset) {
			System.out.println(s);
		}
		Iterator<String> iter=myset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
		