package day5;

/*What will be printed out if this code is run with the following command line? 
 java Program5 good morning*/
 
public class Program5 {
	public static void main(String argv[]) {  
		System.out.println(argv[2]);//Exception is raised since index is out of range  
	}
}
