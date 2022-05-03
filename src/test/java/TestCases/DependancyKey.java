package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependancyKey {




			@BeforeMethod
			public void setup() {
			 System.out.println("beforemethod");
			}
			@Test
			public void method2 ()
			{
				System.out.println("method2");
				
			}@Test
			public void method1 ()
			{
				System.out.println("method1");
				
			}@Test
			public void method4 ()
			{
				System.out.println("method4");
				
			}@Test
			public void method5 ()
			{
				System.out.println("method5");
				
			}@Test
			public void method3 ()
			{
				System.out.println("method3");
				
			}
			@BeforeMethod
			public void close () {
			System.out.println("close");
			}
		}

