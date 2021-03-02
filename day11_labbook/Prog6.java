package day11_labbook;

public class Prog6 {
	public static void main(String[] args) throws Exception{
		Derived d=new Derived();
	}
}


//Derived class cannot handle exception thrown by base class

class Base{
	public Base()  throws Exception{
		throw new MyException2();
	}
}

class Derived extends Base{
	public Derived() throws Exception{

	}
}

class MyException2 extends Exception{
	public MyException2() {
		System.out.println("Test");
	}
}