package day5;

public class Program42 {
	public static void main(String argv[]){   
		Program42 l = new Program42();       
		l.amethod();      
	}       
	public void amethod(){         
		int ia[] = new int[4];       
		for(int i=0;i<ia.length;i++)     
		{           
			ia[i]=i;     
			System.out.println(ia[i]);    
		}         
	}
}

/*Output:
 0
 1
 2
 3*/
