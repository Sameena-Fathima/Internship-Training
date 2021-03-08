package day13;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsDemo4 {
	public static void main(String[] args) {
		Map<MyKey,String> map=new TreeMap<>((o1,o2)->{return
		o2.compareTo(o1);});
		MyKey mykey1=new MyKey("a1");
		MyKey mykey2=new MyKey("a2");
		MyKey mykey3=new MyKey("a3");
		map.put(mykey1, "ramu");
		map.put(mykey2, "somu");
		map.put(mykey3, "raju");
		System.out.println(map);
		String result=map.get(mykey1);
		System.out.println(result);
		Set<Map.Entry<MyKey, String>> set=map.entrySet();
		Iterator<Map.Entry<MyKey,String>> iter=set.iterator();
		while(iter.hasNext()) {
		Map.Entry<MyKey,String> me=iter.next();
		System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}
class MyKey implements Comparable<MyKey>{
	String key;
	public MyKey(String key) {
		this.key=key;
	}
	@Override
	public String toString() {
		return this.key;
	}
	@Override
	public int compareTo(MyKey o) {
		return this.key.compareTo(o.key);
	}
}