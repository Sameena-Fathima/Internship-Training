package day16;

/*
 * % - symbol after which the formating instruction follows
 * [flag] - + (default) or - padding to the right side...  + padding to the left sife...
 * [width] - in padding how many output characters you want....(space)
 * [.] - precision - this is only for floating points...
 * s,d,f - to represent string,integer or float
 *
 */
public class StringFormating {
	public static void main(String[] args) {
		//System.out.printf("formating instruction","input" );
		System.out.printf("Integer value...:%d...%s...is...%f...the value",200,"hello world",12.4f);
		String s=String.format("\nString:%s,Integer:%04d,Float:%.2f", "hai",100,20.398811);
		
		System.out.println(s);
		
		System.out.printf("\n%-15s%-15s%s","Column1","Column2","Column3");
		// \n, \t, \f, \b
		System.out.println();
		met(1,2,3,4,5);

	}
	
	public static void met(int... i) {
		for(int itr:i) {
			System.out.println(itr);
		}
	}
}