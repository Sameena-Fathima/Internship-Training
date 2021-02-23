package day6;

public class OverrideDemo {
	public static void main(String[] args) {
		Parent parent=new Child();
		parent.met();
	}

}

abstract class Parent{
	final float pi=3.14f;
	public void met() {
		System.out.println("Parent class method called");
	}
}

class Child extends Parent
{
	public void met() {
		System.out.println("Child class method called");
	}
}