package day11_labbook;

public class Prog4 {
	public static void main(String[] args) {
		try {
			met(0);
		}
		catch(Exception e) {
			System.out.println(e);;
		}
	}
	
	public static void met(int i) throws Exception
	{
		if(i==0)
			throw new MyException("Do not divide by zero");
		System.out.println(10/i);
	}
}

class MyException extends Exception{
	String msg;
	public MyException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return msg;
	}
}