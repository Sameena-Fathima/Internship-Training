package day5;

public class Program41 {
	static int j=20; 
	public static void main(String argv[]){     
		int i=10;      
		Program41 p = new Program41();       
		p.amethod(i);      
		System.out.println(i);  
		System.out.println(j);  
	}         
	public void amethod(int x){       
		x=x*2;        
		j=j*2;      
	}
}

/*Output:
	10
	40*/