package day5;

class Base{ 
	private void amethod(int iBase){   
		System.out.println("Base.amethod");  
	}
}

class Program59 extends Base{ 
	public static void main(String argv[]){     
		Program59 o = new Program59();    
		int iBase=0;       
		o.amethod(iBase);   
	}        
	public void amethod(int iOver){         
		System.out.println("Over.amethod");   //prints Over.amethod
	} 
}


