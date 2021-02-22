package day5;

public class Program1 {
	public static void main(String[] args) {
		 float f=1.3; //throws compilation error since it should be initialized as 1.3f to be considered as float
		 char c="a"; //throws compilation error since char should be initialized as c='a'
		 byte b=257; //throws compilation error since byte range is only till 127
		 boolean b=null;//throws compilation error since it should be either true or false
		 int i=10;
	}
}
