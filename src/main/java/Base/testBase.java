package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testBase {

                 public static WebDriver driver;
                 
                 public static    Properties prop ;
                 
                 public testBase() throws IOException {                                                            // Constructor
                	 
                	 prop = new Properties();
                	 FileInputStream file = new  FileInputStream ("C:\\Users\\sarvadnya\\eclipse-workspace\\zerodha\\Config\\config1properties");
                	 prop.load(file);
                	 
                 }
				public static void initalization() 
				{
                	 ChromeOptions options = new ChromeOptions(); 
                	 options.addArguments("--disable-notifications");
                     System.setProperty("webdriver.chrome.driver", "C:/Users/sarvadnya/eclipse-workspace/zerodha/chromedriver100.exe");
                     driver = new ChromeDriver (options);
                     driver.manage().window().maximize();
                     driver.get(prop.getProperty("url")) ;
                     System.out.println((prop.getProperty("url")));
                   //  driver.get("https://groww.in/");
                     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                       }
	
	
	
	
	
	
	
	
}
