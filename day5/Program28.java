package day5;

public class Program28 {
	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2=new String("there");
		String s3=new String();
		s3=s1+s2;
		System.out.println(s3);//prints Hellothere
		s3=s1-s2;//invalid
		s3=s1&s2;//invalid
		s3=s1 && s2;//invalid
	}
}
