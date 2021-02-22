package day5;

public class Program14 {
	public static void main(String[] args) {
		/*int i=0;  
		if(i) { //throws compilation error since if condition should be boolean
			System.out.println("Hello");    
		} */
		
		boolean b=true;
		boolean b2=true; 
		if(b==b2) {  
			System.out.println("So true");   //prints So true
		} 
		
		int i=1;  
		int j=2; 
		if(i==1|| j==2)    
			System.out.println("OK"); //prints OK
		
		/*int i=1;
		int j=2;
		if(i==1 &| j==2)    //syntax error since &| is invalid symbol
			System.out.println("OK");*/
	}
}
