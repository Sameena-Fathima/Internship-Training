package day3;

public class AccessDemo {
	public static void main(String[] args) {
		System.out.println("Welcome to JAVA");
	}

}



class ChildTest extends Test{
	public void childMet() {
		//System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}

class NonChild{
	public void childMet() {
		Test test=new Test();
		//System.out.println(test.pri);
		System.out.println(test.nomod);
		System.out.println(test.pro);
		System.out.println(test.pub);
	}
}