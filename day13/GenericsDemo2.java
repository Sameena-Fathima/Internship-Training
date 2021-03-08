package day13;

import java.util.ArrayList;

public class GenericsDemo2 {
	public static void main(String[] args) {
		int arr[]=new int[5];
		ArrayList<String> arrList=new ArrayList<>();
		arrList.add("aaaa");
		// arrList.add(122);
		// arrList.add(1.3f);
		for(int i=0;i<arrList.size();i++) {
			String s=(String)arrList.get(i);
		}
	}
}
