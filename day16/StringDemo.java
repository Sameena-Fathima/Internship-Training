package day16;

import java.util.StringJoiner;
import java.util.StringTokenizer;
public class StringDemo {
	public static void main(String[] args) {
		String s="hello world";
		String ss=new String("hello world");//two representations - one in heap and another in stack
		
		//strings are immutable
		String temp=ss;
		ss="world world"+ss;
		
		System.out.println(temp);
		
		System.out.println(ss);
		
		StringBuilder sb=new StringBuilder("hello world from string builder");  //non synchronized		
		System.out.println(sb);		
		sb.append("new value appended");		
		System.out.println(sb);
		
		StringBuffer sbf=new StringBuffer("hello world from string buffer");//synchronized
		sbf.append("new value for buffer");
		System.out.println(sbf);
		
		StringJoiner sJoiner=new StringJoiner(",");
		System.out.println(sJoiner);
		sJoiner.add("hello");
		sJoiner.add("world");
		System.out.println(sJoiner);
		
		sJoiner=new StringJoiner(",","[","]");
		sJoiner.add("hello");
		sJoiner.add("world");
		sJoiner.add("be");
		sJoiner.add("happy");
		System.out.println(sJoiner);
		
		StringTokenizer sToken=new StringTokenizer(sJoiner.toString(),",");
		while(sToken.hasMoreTokens()) {
			System.out.println(sToken.nextToken());
		}
		
	}
}
