package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;

public class suit2 extends testBase {

	public suit2() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	public void suitpractice() {
		
	}
	
	
	@BeforeMethod
	public void setup() {
		
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}@Test
	public void test3()
	{
		System.out.println("test3");

	}@Test
	public void test1()
	{
		System.out.println("test3");

	}
	
	
	@AfterMethod
	public void close() {
		
	}
}
