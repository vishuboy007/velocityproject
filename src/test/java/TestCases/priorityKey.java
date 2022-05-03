package TestCases;

import java.sql.Driver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class priorityKey {

	@BeforeMethod
	public void setup() {
	 System.out.println("beforemethod");
	}
	@Test(priority = 3)
	public void method2 ()
	{
		System.out.println("method2");
		
	}@Test(groups = "sanity")
	public void method101 ()
	{
		System.out.println("method101");
		
	}@Test(priority = 0)
	public void method4 ()
	{
		System.out.println("method4");
		
	}@Test(priority = 2)
	public void method5 ()
	{
		System.out.println("method5");
		
	}@Test(priority = 1)
	public void method3 ()
	{
		System.out.println("method3");
		
	}
	@BeforeMethod
	public void close () {
	System.out.println("close");
	}
}
