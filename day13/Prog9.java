package day13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prog9 {
	public static void main(String[] args) {
		Object o = new Object(); 
		//Set s = new HashSet(); //it compiles and executes without exception 
		//TreeSet s = new TreeSet(); //it compiles and executes without exception 
		LinkedHashSet s = new LinkedHashSet(); //it compiles and executes without exception 
		
		s.add("o");  
		s.add(o);
	}
}