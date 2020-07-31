package pckg23052020;

import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

//import lib.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

public class passfail implements ITestListener {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	WebDriver driver;
	
int i=0;
	

	public static void screenshot(WebDriver driver, String screenshotname) {
		try {
			Random objGenerator = new Random();
			int randomNumber = objGenerator.nextInt(100);
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(
					"C:\\Users\\hp\\Desktop\\Screenshots_Failure\\" + screenshotname + " " + randomNumber + ".png"));
			System.out.println("Screenshot taken");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	@DataProvider(name = "wordpressdataexcel")
	public Object[][] passdataexcel() {

		ExcelDataConfig1 config = new ExcelDataConfig1("C:\\Users\\hp\\Desktop\\wplogin.xlsx");
		int rows = config.getrowcount(0);
		System.out.println(rows);
		int cls = config.getcolcount(0);
		System.out.println(cls);
		Object[][] data = new Object[rows][2];

		for (int i=0; i < rows;i++) {
			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);
			
			
		}

		return data;

	}

	@AfterMethod
	public void afterm() throws IOException {
		
			driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			 File src=new File("C:\\Users\\hp\\Desktop\\wplogin.xlsx");
				
			 FileInputStream fisin=new FileInputStream(src);
			 	
			wb=new XSSFWorkbook(fisin);
			 	   sheet=wb.getSheetAt(0);
			 	 sheet.getRow(1).createCell(2).setCellValue("fail");
			 	 
			 	 FileOutputStream fout=new FileOutputStream(src);
			 	 
			 	 wb.write(fout);
			 	 System.out.println("creds failed");
		} else if (ITestResult.SUCCESS == result.getStatus()) {
			File src=new File("C:\\Users\\hp\\Desktop\\wplogin.xlsx");
			
		 FileInputStream fisin=new FileInputStream(src);
			 	  
			 	wb=new XSSFWorkbook(fisin);
			 	   sheet=wb.getSheetAt(0);
			 	 sheet.getRow(0).createCell(2).setCellValue("pass");
			 	 
			 	 FileOutputStream fout=new FileOutputStream(src);
			 	 
			 	 wb.write(fout);
			 	System.out.println("creds passed");
		}
		driver.quit();
	}

	@Test(dataProvider = "wordpressdataexcel")
	public void wordpressloginExcel(String uname, String pwd) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://wordpress.com/log-in");
		
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("usernameOrEmail"));
		username.sendKeys(uname);
		
		Thread.sleep(800);
		WebElement cont = driver.findElement(By.xpath("//button[@class='button form-button is-primary']"));
		cont.click();
		Thread.sleep(800);
		WebElement password = driver.findElement(By.id("password"));

		System.out.println(password.isDisplayed());


		password.sendKeys(pwd);
		WebElement login = driver.findElement(By.xpath("//button[@class='button form-button is-primary']"));
		login.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 9000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='masterbar__item masterbar__item-new']")));
	
		String afterlogin=driver.findElement(By.xpath("//a[@class='masterbar__item masterbar__item-new']")).getText();
		System.out.println(afterlogin);
		Assert.assertEquals("Write", afterlogin);
		

	}

	
	
	
	
	
	
	
	
	
	
	
	@AfterTest
	public void afterTest() throws IOException {
		// wb.close();
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test(enabled = false)
	public void wordpressloginvaluetest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://wordpress.com/log-in");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("usernameOrEmail"));
		username.sendKeys("joydeep chowdhury");
		System.out.println(username.getAttribute("value"));
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]"))).perform();
		Thread.sleep(700);
		String booyah = driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]")).getAttribute("class");
		System.out.println("done");
		System.out.println(booyah);
	}

	public void t() {
		// TODO Auto-generated method stub

		// WebElement start=driver.findElement(By.xpath("//div[contains(@class,'circle
		// extra-small center clickable"+i+""));
		String sarr[] = { "amber", "red", "green", "blue" };
		for (int i = 0; i < 4; i++) {
			System.out.println(sarr[i]);
			WebElement start = driver
					.findElement(By.xpath("//div[contains(@class,'circle extra-small center clickable" + sarr[i] + ""));
			System.out.println("//div[contains(@class,'circle extra-small center clickable" + " " + sarr[i]);
			if (start.isDisplayed()) {
				start.click();
			}
		}

	}
}
