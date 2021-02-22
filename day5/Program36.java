package day5;

public class Program36 {
	public static void main(String argv[]){  
		Program36 e=new Program36();      
	}
	Program36(){   
		String s="Java";    
		String s2="java";  
		if(s.equalsIgnoreCase(s2)){  
			System.out.println("Equal");  
		}
		else{ 
			System.out.println("Not equal");   
		}     
	}
}

//Output:Equal 
	
