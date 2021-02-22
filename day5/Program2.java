package day5;

public class Program2 {
	 public static void main(String arguments[]) {         
		 amethod(arguments);   //throws compilation error since object should be created to access non-static method      
	 }         
	 public void amethod(String[] arguments) {      
		 System.out.println(arguments);                
		 System.out.println(arguments[1]);       
	 } 
}
