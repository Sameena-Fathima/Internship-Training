package day1;

public class Prog23_ProtectedData {
	protected int a=10;
	public static void main(String[] args) {
		AccessData obj=new AccessData();
		obj.printData();
	}
}
class AccessData extends Prog23_ProtectedData 
{
	public void printData() {
		a=a+10;
		System.out.println(a);
	}
}