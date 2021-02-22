package day5;

public class ArrayDemo2 {
	public static void main(String[] args) {
		//reading an array/processing an array      
		String s[]= {"hello","world"}; 
		for(String ss:s) {        
			System.out.println(ss);   
		} 
		int size=s.length; 
		for(int i=0;i<size;i++) {    
			System.out.println(s[i]);   
		}
		Command command[][]=new Command[2][3];
		command[0][0]=new Command("first row first column"); 
		command[0][1]=new Command("first row second column");
		command[0][2]=new Command("first row third column"); 
		command[1][0]=new Command("second row first column"); 
		command[1][1]=new Command("second row second column"); 
		command[1][2]=new Command("second row third column"); 
		//to process a two dimensional array, we need nested for loops
		for(Command c[]:command) {
			for(Command com:c) {   
				System.out.print(com+"\t");        
			}          
			System.out.println("\n");    
		} 
		for(int i=0;i<command.length;i++) { 
			for(int j=0;j<command[i].length;j++) {    
				System.out.print(command[i][j]+"\t");    
			}         
			System.out.println("\n");    
		}    
	}
}

class Command{    
	String msg; 
	public Command(String msg) { 
		this.msg=msg;    
	}
	@Override
	public String toString() { 
		return this.msg;   
	} 
	//complex type object array     
	
}