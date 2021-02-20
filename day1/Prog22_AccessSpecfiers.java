package day1;

public class Prog22_AccessSpecfiers {
	public static void main(String[] args) {
		AccessSpecifiers obj=new AccessSpecifiers();
		System.out.println("Public  variable:"+obj.pub);
		System.out.println("Private  variable:"+obj.pri);//private variable cannot be accessed here
		System.out.println("Protected  variable:"+obj.pro);
		System.out.println("Default  variable:"+obj.nomod);
		obj.publicMethod();
		obj.privateMethod();//private method cannot be called from here
		obj.protectedMethod();
		obj.defaultMethod();
		
	}
}
	
	
class AccessSpecifiers
{
	public int pub=4;
	private int pri=2;
	protected int pro=5;
	int nomod=3;
	
	public void publicMethod() {
		System.out.println("This is public method");
	}
	private void privateMethod() {
		System.out.println("This is private method");
	}
	protected void protectedMethod() {
		System.out.println("This is protected method");
	}
	void defaultMethod() {
		System.out.println("This is default method");
	}
	
}
	
	