package day5;

abstract class MineBase {     
	abstract void amethod();   
	static int i;  
}

public class Program11 extends MineBase{    //Program11 should implement the abstract method else Program11 should also be declared as abstract
	public static void main(String argv[]){    
		int[] ar=new int[5];               
		for(i=0;i < ar.length;i++)      
			System.out.println(ar[i]); 
	} 

}