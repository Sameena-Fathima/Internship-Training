package day10;

public class CloneDemo {
	public static void main(String[] args)throws Exception {
		Sheep sheep1=new Sheep();
		sheep1.name="i am sheep 1...";
		Sheep sheep2=sheep1.getSheepClone();
		sheep2.name="i am sheep 2....";
		
		System.out.println("Sheep 1...:"+sheep1.name);
		Test test1=sheep1.getTest();
		test1.amt=10000;
		System.out.println("Sheep 2...:"+sheep2.name);
		Test test2=sheep2.getTest();
		test2.amt=20000;
		System.out.println("Test1 amount...:"+test1.amt);
		
		System.out.println("Test2 amount...:"+test2.amt);
		
	}
}
//resources to be shared but properties to be unique.....
class Sheep implements Cloneable{
	String name;//primitive type - this will be unique...
	Test test;//complex type - this will not be unique...
	public Sheep() {
		System.out.println("sheep object created....");
	}
	
	public Test getTest()throws Exception {
		return Test.getTestObj().getTestClone();
	}
	
	public Sheep getSheepClone()throws Exception {
		return (Sheep)super.clone();
	}
}
abstract class TestParent{
	public Test getTestClone()throws Exception{
		return (Test)super.clone();
	}
}
class Test extends TestParent implements Cloneable{
	int amt;
	private static Test test;
	public static Test getTestObj() {
		if(test==null) {
			test=new Test();
		}
		return test;
	}	
	private Test() {
		System.out.println("test object created...");
	}
}
