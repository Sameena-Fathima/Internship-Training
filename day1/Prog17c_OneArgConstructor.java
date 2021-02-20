package day1;

public class Prog17c_OneArgConstructor {
	int n;
	Prog17c_OneArgConstructor(int elem)
	{
		n=elem;
	}
	public static void main(String[] args) {
		 Prog17c_OneArgConstructor obj=new Prog17c_OneArgConstructor();//throws error since parameter is not passed
		
	}
}
