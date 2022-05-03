package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sarkhesarkhe {
	
	@Test
	public void Fb() {
		System.setProperty("webdriver.chrome.driver", "chromedriver100.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("url");
	}

}
