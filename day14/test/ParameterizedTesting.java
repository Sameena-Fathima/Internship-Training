package day14.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTesting {
	@Parameter(0)
	public int i;
	@Parameter(1)
	public int j;
	@Parameter(2)
	public int result;
	
	@Parameters
	public static Collection<Object[]> getData() {
		Object[][] data = new Object[][] {
			{10, 10, 20},
			{20, 20, 40},
			{30, 30, 60}
		};
		return Arrays.asList(data);
	}
	
	static Calculator calc = null;	
	@BeforeClass
	public static void init() {
		calc = new Calculator();
	}
	
	@Test
	public void myTest() {
		assertEquals("Result: ", result, calc.add(i,j));
	}
}