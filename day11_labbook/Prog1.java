package day11_labbook;

import java.io.IOException;

public class Prog1 {
	public static void main(String[] args) {
		sample s= new sample();
		s.met();
	}
}

class sample{
	public void met() {
			//throw new IOException();//shows error since it should be surrounded by a try-catch block
	}
}