package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class loginPage extends testBase {              // ethe  loginpage  class ahe

	
	// object repository
	
	@FindBy(xpath = "//span[text()='Login/Register']")private WebElement logintoapp ;
	
	@FindBy(xpath = "(//img[@alt='Groww Logo'])[1]")private WebElement  mainlogo;	
	
    
	@FindBy(xpath = "//input[@id='login_email1']")private WebElement    mailTextBox;

	@FindBy(xpath = "//span[text()='Continue']")private WebElement continueBtnAfterEmail;
	
	@FindBy(xpath="//div[@class='group inf11Input']//input[@type='password']")private WebElement    passTextBox;          
	
	@FindBy(xpath = "(//div[@class='btn51Btn btn51RipplePrimary btn51Primary'])[1]")private WebElement         submitbtn;

	@FindBy(xpath = "(//input[@class='otpinput88'])[1]")private WebElement pass1;
	@FindBy(xpath = "(//input[@class='otpinput88'])[2]")private WebElement pass2;
	@FindBy(xpath = "(//input[@class='otpinput88'])[3]")private WebElement pass3;
	@FindBy(xpath = "(//input[@class='otpinput88'])[4]")private WebElement pass4;
	@FindBy(xpath = "//input[@class='txtinput88input fs14 ']")private WebElement serchbox ;

	
 public loginPage()  throws IOException        // here we taking contractor
 {
	 PageFactory.initElements(driver, this);
 }

 // ethe apan methods creat karun gyacha jya apan use krnar ahot
	
	public void serchbox() throws InterruptedException {
		serchbox.click();
		Thread.sleep(2000);
		serchbox.sendKeys("tcs");
		Thread.sleep(5000);

//		Action a = (Action) new Actions(driver);
//	a.mov
	}
	
	
	
	
	public String ValidateLoginTitle() {
		return driver.getTitle();
	}
	
	public boolean validateGrowLogo() {
	 return mainlogo.isDisplayed();
	}
	


	public void enterEmail() throws InterruptedException 
	{
		logintoapp.click();
		//Thread.sleep(1000);
		mailTextBox.click();
	//	Thread.sleep(1000);
		mailTextBox.sendKeys(prop.getProperty("emailID"));
	//	Thread.sleep(1000);
		continueBtnAfterEmail.click();
	//	Thread.sleep(5000);
		passTextBox.sendKeys(prop.getProperty("password"));
	//	Thread.sleep(1000);
		 submitbtn.click();
	//	Thread.sleep(3000);
		
		pass1.sendKeys(prop.getProperty("pin1"));
	//	Thread.sleep(1000);

		pass2.sendKeys(prop.getProperty("pin2"));
	//	Thread.sleep(1000);

		pass3.sendKeys(prop.getProperty("pin3"));
		//Thread.sleep(1000);

		pass4.sendKeys(prop.getProperty("pin4"));
	//	Thread.sleep(1000);

	}
	
	
	
	
	
	
	
	}
