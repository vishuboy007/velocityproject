package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;
import Pages.DashbordPage;
import Pages.loginPage;

      public class DashbordPageTest extends testBase {

	    public DashbordPageTest() throws IOException {
			super();
			// TODO Auto-generated constructor stub
		}


		DashbordPage dash ;
	    loginPage login;
	
     @BeforeMethod
      public void setup() throws InterruptedException, IOException {
	  initalization();
	 dash =  new DashbordPage();
	 login = new loginPage();
	 login.enterEmail();
}
//       @Test
//       public void investmentpageTest() throws InterruptedException {
//	   dash.investmentpage();
//       }
//       
//	@Test
//	public void TCS() throws InterruptedException
//	{ 
//		dash.TCS();
//                        }
	
	
    @Test
     public void searchtextbox() throws InterruptedException, EncryptedDocumentException, IOException {
	dash.searchtextbox();
	}

//	@Test
//	public void  PageNavigat() throws InterruptedException {
//		dash.PageNavigat();
//	}

//	@Test
//	public void verifyUsernameTest() throws InterruptedException
//	{
//		String exp = "Vishu Bhalchandra Ahire";
//		String act =dash.verifyUsername();
//		Thread.sleep(2000);
//		Assert.assertEquals(exp,act );
//		Reporter.log("title ="+act);
//	}
//	@Test
//	public void verifyEmailTest() throws InterruptedException {
//		boolean value = dash.verifyEmail();
//		Thread.sleep(2000);
//		Assert.assertEquals(value, true);
//        Reporter.log("email="+value);
//	}
	
	
//	@Test
//	public void theamchangeTest () throws InterruptedException {
//		dash.theamchange();
//		}
	
	

@AfterMethod
	public void closee(ITestResult it) throws IOException {
	
	if(ITestResult.FAILURE==it.getStatus()) 
	     {
		utitlity.util.captureScreenshot(driver, it.getName());
	     }
	
	
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
