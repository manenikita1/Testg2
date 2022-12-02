package Test_cases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationsTest {

	@AfterClass
	public void test1()
	{
		System.out.println("test1");
	}
	@AfterSuite
	public void test2()
	{
		System.out.println("test2");
	}
	@AfterMethod
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterTest
	public void test4()
	{
		System.out.println("test4");
	}
	@Test
	public void test5()
	{
		System.out.println("test5");
	}
	@BeforeMethod()
	public void test6()
	{
		System.out.println("test6");
	}
	@BeforeClass
	public void test7()
	{
		System.out.println("test7");
	}
	@BeforeSuite
	public void test8()
	{
		System.out.println("test8");
	}
	@BeforeTest
	public void test9()
	{
		System.out.println("test9");
	}
	
	//before suit
	//before test 
	//before class
	//before method
	//test
	//after method
	//after class
	//after test
	//after suit
	//
	
}
