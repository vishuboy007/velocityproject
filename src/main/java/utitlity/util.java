package utitlity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class util   {
	private static final String TakesScreenshot = null;

	
	public static String excelsheet(int rownum,int colnum) throws EncryptedDocumentException, IOException {
		
	
	FileInputStream file = new FileInputStream("C:/Users/sarvadnya/eclipse-workspace/zerodha/excel/grow.xlsx");

	   Sheet excelsheet = WorkbookFactory.create(file).getSheet("sheet1");
	
	   return excelsheet.getRow(rownum).getCell(colnum).getStringCellValue();
	
	}
	

public static void captureScreenshot(WebDriver driver , String name) throws IOException {
	
 File  source  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 
 File newlocation = new  File ("C:/Users/sarvadnya/eclipse-workspace//zerodha/screenshot/"+name+".jpeg");

 org.openqa.selenium.io.FileHandler.copy(source, newlocation);
}















}
