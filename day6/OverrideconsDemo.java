package day6;

public class OverrideconsDemo {
	public static void main(String[] args) {
		ParentClass pc=new ChildClass();
		pc.met();
	}
}

abstract class ParentClass{
	public ParentClass() {
		System.out.println("parent class constructor called");
	}
	public ParentClass(int i) {
		System.out.println("parent class parametrized constructor called");
	}
	final public void met()
	{
		System.out.println("parent method called");
	}
}

class ChildClass extends ParentClass
{
	public ChildClass() {
		super(10);
		System.out.println("child class constructor called");
		// super(1); //it should always be placed in the first line of constructor
	}
}