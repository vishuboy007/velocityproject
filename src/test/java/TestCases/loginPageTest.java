package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;
import Pages.loginPage;

public class loginPageTest extends testBase {
	



	public loginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	loginPage login;
	
	@BeforeMethod
	public void setup () throws IOException {
		                  initalization();
		                  login = new loginPage();
	                    }

    @Test                                                                            //(timeOut = 500) we use this when we have to fail any test
	public void ValidateLoginTitleTest()
	{
   	String exp = "Groww - Online Demat, Trading and Direct Mutual Fund Investment in India";
    	String act = login.ValidateLoginTitle();
    Assert.assertEquals(exp, act);                      // Compare krtoy  apan ethe 
    Reporter.log("tital ="+act);

	}
    @Test        //(enabled = false)                                                                     // use this when we have to skip the test
    public void  validateGrowLogo()
    {
         boolean value =	login.validateGrowLogo();
         Assert.assertEquals(value, true);
         Reporter.log("grow logo is ="+value);
    }

@Test    //(priority = -1, enabled = true , invocationCount = 2)                                                              // run for particular repitation 
public void serchboxTest() throws InterruptedException {
	login.serchbox();
}
    @Test  
	public void enterEmailTest() throws InterruptedException {
		login.enterEmail();
	}
 
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
