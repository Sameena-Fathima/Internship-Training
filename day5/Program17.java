package day5;

class Base {}  
class Sub extends Base {}  
class Sub2 extends Base {} 
public class Program17{   
	public static void main(String argv[]){     
		Base b=new Base();             
		Sub s=(Sub) b;      //throws runtime exception since Base class cannot be cast to Sub class     
	}
}
