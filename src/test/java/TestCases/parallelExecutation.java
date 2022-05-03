package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelExecutation {


		 
		 
		 @Test
		 
		 public void site1()
		 {
		 System.setProperty("webdriver.chrome.driver","chromedriver100.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.angelone.in/");
		// driver.close();
		    }
		 
		 @Test
		 
		 public void site2()
		 {
		 System.setProperty("webdriver.chrome.driver","chromedriver100.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		// driver.close();
		    }
		 
		 @Test
		 
		 public void site3()
		 {
		 System.setProperty("webdriver.chrome.driver","chromedriver100.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://groww.in/");
		// driver.close();
		    }
		  
		}

