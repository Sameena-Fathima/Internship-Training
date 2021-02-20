package day1;

public class Prog27_Investment {
	public static void main(String[] args) {
		int val=14000;
		double first_year=val+(0.40*val);//Increasing by 40% in the first year
		double second_year=first_year-1500;//Deducting 1500 in the second year
		double third_year=second_year+(0.12*second_year);//Increasing by 12% in the third year
		System.out.println("Final value of investment:third_year");
	}

}
