package day5;
import java.applet.*; 
import java.awt.*; 

public class Program18 extends Applet {
	 public void init(){   
		 String parameter = getParameter("age");
		 System.out.println(parameter);   //prints null
	 }
}
