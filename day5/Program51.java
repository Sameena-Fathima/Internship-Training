package day5;

public class Program51 {
	private int i; 
	public static void main(String argv[]){      
		Program51 s = new Program51();           
		s.amethod();    
	}//End of main  
	public static void amethod(){             
		System.out.println(i);     //throws compile time error    
	}//end of amethod
}
