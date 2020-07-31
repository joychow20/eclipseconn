package Barclays_Client;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScreenShot {
	WebDriver driver;

	public void startBrowser() {

		System.out.println("Lets start testing");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
//		driver = new FirefoxDriver();

	}
	
	@Test
	public void xpath() throws InterruptedException {
		this.startBrowser();
		driver.get("https://www.guru99.com/handling-iframes-selenium.html");
WebElement sap=		driver.findElement(By.xpath("//span[@class='g-separator g-menu-item-content']//span[@class='g-menu-item-title'][contains(text(),'SAP')]"));
WebElement sap1=driver.findElement(By.xpath("//div[@class='g-content g-particle']/child::nav/child::ul/child::li[3]"));
Thread.sleep(300);
sap1.click();
Actions act=new Actions(driver);
act.moveToElement(sap1);
System.out.println(sap1.getText());	


Thread.sleep(3000);
driver.manage().window().maximize();
Thread.sleep(300);

driver.quit();
	}
	@Test
	public void readexcel() throws IOException {
		File src=new File("C:\\Users\\hp\\Desktop\\MySheet.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int size=sheet.getLastRowNum();
		int row=size+1;
		for(int i=0;i<row;i++) {
			String data=sheet.getRow(i).getCell(i).getStringCellValue();
			System.out.println(data);
		}
		
		
			
		}
	
	
	
	
	

	@Test(enabled=false)
	public void ss() throws IOException {
		this.startBrowser();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		File dest=new File("./screeshots/"+ Math.random()+ ".png");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=	ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,dest);
			System.out.println("Screenshot taken");
			driver.quit();
		}
}
