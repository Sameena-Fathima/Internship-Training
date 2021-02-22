package day5;

class Base{ 
	Base(int i){     
		System.out.println("base constructor");       
	}        
	Base(){   } 
}
public class Program40 extends Base {
    public static void main(String argv[]){    
    	Program40 s= new Program40();      
    	//One      
    }        
    Program40() {       
    	super(10);    //Invokes the constructor in the parent class to print base constructor    
    }       
    public void derived()   {   
    	//Three        
    } 
}
   
