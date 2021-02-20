package day1;

public class Prog17a_ModifyConst {
	public static void main(String[] args) {
		final int n=12;
		n=15;	//It will throw an error since final variables cannot be changed
	}
}
