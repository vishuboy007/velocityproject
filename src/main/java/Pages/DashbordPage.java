package Pages;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class DashbordPage extends testBase   {


	@FindBy(xpath = "(//div[@class='valign-wrapper dashboardTabsText'])[1]")private WebElement   stock ;
	@FindBy(xpath = "(//div[@class='valign-wrapper dashboardTabsText'])[2]")private WebElement   MatualFunds ;
	@FindBy(xpath = "(//div[@class='valign-wrapper dashboardTabsText'])[3]")private WebElement   FixDeposits ;
	@FindBy(xpath = "//div[text()='US Stocks']")private WebElement   Usstocks ;

	@FindBy(xpath = "(//div[@class='dropdown__trigger '])[1]") private WebElement profile ;
	@FindBy(xpath = "//a[@class='nameAnchor']")private WebElement verifyUsername;
	@FindBy(xpath = "//p[@class='truncate headerDggnd']")private WebElement verifyEmail;
	
	@FindBy(xpath = "//div[@class='sw348reactSwitchButton']")private WebElement theamchange;
	
	@FindBy(xpath = "//div[@id='globalSearch23-searchMainDivId']")private WebElement searchtextbox;
	
    @FindBy(xpath = "//a[text()='Investments']")private WebElement investment;
	@FindBy(xpath = "//input[@class='txtinput88input fs14 ']")private WebElement TCS;
	@FindBy(xpath = "//span[text()='Tata Consultancy Services Ltd.']")private WebElement  TcsSuggetion ;
	
	@FindBy(xpath = "//input[@id='inputShare']")private WebElement sharequantity ;
	
	
	@FindBy(xpath = "//span[text()='Limit']")private WebElement marketprice;
	@FindBy(xpath = "//input[@step='0.05']")private WebElement priceEnter;
	@FindBy(xpath = "//div[@class='absolute-center btn51ParentDimension1 ']")private WebElement buy;
	public DashbordPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void searchtextbox() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(2000);
		
		searchtextbox.click();
		Thread.sleep(2000);
		
		searchtextbox.click();

	                                      	TCS.sendKeys(utitlity.util.excelsheet(0, 0));

		TcsSuggetion.click();

		                                sharequantity.sendKeys(utitlity.util.excelsheet(0, 1));
		Thread.sleep(2000);
		
		
	//	marketprice.click();
	//	Thread.sleep(2000);
		
		priceEnter.click();
		
		priceEnter.clear();		
		Thread.sleep(1000);

	                                        	priceEnter.sendKeys(utitlity.util.excelsheet(0, 2));
		Thread.sleep(1000);

		buy.click();
		Thread.sleep(5000);

	}
//	public void TCS() throws InterruptedException {
//		Thread.sleep(2000);
//
//		searchtextbox.click();
//
//		TCS.sendKeys("tcs");
//
//		TcsSuggetion.click();
//
//		sharequantity.sendKeys("200");
//		Thread.sleep(5000);
//
//		
//}
	
//	public void PageNavigat() throws InterruptedException {
//		stock.click();
//		Thread.sleep(1000);
//		MatualFunds.click();
//		Thread.sleep(1000);
//		FixDeposits.click();
//		Thread.sleep(1000);
//		Usstocks.click();
//		Thread.sleep(1000);
//	}

//public String verifyUsername () throws InterruptedException {
//		profile.click();
//		Thread.sleep(1000);
//
//		return verifyUsername.getText ( ) ;
//	}
//	
//	public boolean verifyEmail() throws InterruptedException {
//		profile.click();
//		Thread.sleep(1000);
//
//		return verifyEmail.isDisplayed();
//	}
//	
//	public void investmentpage() throws InterruptedException {
//		investment.click();
//		Thread.sleep(1000);
//	}
	
//public void theamchange() throws InterruptedException {
//	Thread.sleep(2000);
//
//	theamchange.click();
//}

	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	

