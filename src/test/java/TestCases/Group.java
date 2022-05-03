package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Group {
	

			@BeforeMethod
			public void setup() {
			 System.out.println("beforemethod");
			}
			@Test(groups = "sanity")
			public void method2 ()
			{
				System.out.println("method2");
				
			}@Test (groups = "regration")
			public void method1 ()
			{
				System.out.println("method1");
				
			}@Test(groups = "sanity")
			public void method4 ()
			{
				System.out.println("method4");
				
			}@Test( groups = {"sanity","regration"})             //              two combine
			public void method5 ()
			{
				System.out.println("method5");
				
			}@Test(groups = { "sanity","regration"})             //              two combine
			public void method3 ()
			{
				System.out.println("method3");
				
			}
			@BeforeMethod
			public void close () {
			System.out.println("close");
			}
		}
	
