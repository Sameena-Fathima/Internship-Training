package day1;

public class Prog15a_GeneratePrimes {
	public static void main(String[] args) {
		
		
		System.out.println("Prime numbers between 1 to 100");
		for(int i=2;i<=100;i++)
		{
			if(isPrime(i)==1)
				System.out.println(i);
		}
	}
	static int isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return 0;
		}
		return 1;
	}

}
