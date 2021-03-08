package day14.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyTestCase2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("set up before class executed...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("set up after class executed...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setup executed...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tear down expected...");
	}

	@Test
	public void test1() {
		System.out.println("test1 method called...");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 method called...");
	}
	
	@Test
	public void test3() {
		System.out.println("test3 method called...");
	}
}