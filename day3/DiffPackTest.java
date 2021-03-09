package day3;

public class DiffPackTest extends Test {
	public void childMet() {
//		System.out.println(pri);
//		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}

}

class NonChildDiff{
	public void childMet() {
		Test test=new Test();
//		System.out.println(test.pri);
//		System.out.println(test.nomod);
//		System.out.println(test.pro);
		System.out.println(test.pub);
	}
}
