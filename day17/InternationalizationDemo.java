package day17;

import java.util.Locale;
import java.util.ResourceBundle;
public class InternationalizationDemo {
	public static void main(String[] args) {

		Locale.setDefault(new Locale("ta"));
		Locale locale=Locale.getDefault();
		System.out.println(locale);
		//ResourceBundle rb=ResourceBundle.getBundle("day17/Dictionary",locale);//this is referring to file
		ResourceBundle rb=ResourceBundle.getBundle("day17.Dictionary",locale);//this is referring to class
		System.out.println(rb.getString("hello"));
		
	}
}