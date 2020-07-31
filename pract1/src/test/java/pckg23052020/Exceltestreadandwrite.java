package pckg23052020;

import org.testng.annotations.Test;
import org.testng.util.Strings;

import java.awt.AWTException;
import java.awt.Robot;

//import lib.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

public class Exceltestreadandwrite  implements ITestListener {
	  XSSFWorkbook wb;
	  XSSFSheet sheet;
	  WebDriver driver;
	  
	  public void startbrowser() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		  
	  }
	  
	  public static void screenshot(WebDriver  driver,String screenshotname) {
		  try {
			  Random objGenerator = new Random();
			  int randomNumber = objGenerator.nextInt(100);
				TakesScreenshot ts=(TakesScreenshot)driver;
				File src=	ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src,new File("C:\\Users\\hp\\Desktop\\Screenshots_Failure\\"+ screenshotname+" "+randomNumber+".png"));
					System.out.println("Screenshot taken");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} 
	  }
	  @Test
	  public void linktest() throws InterruptedException, AWTException {
		this.startbrowser();
		  driver.get("https://wordpress.com/log-in");
		  driver.manage().window().maximize();
		  Thread.sleep(300);
		  String signuplink=driver.findElement(By.xpath("//a[@class='masterbar__item']")).getAttribute("href");
		  System.out.println(signuplink);
		  ((JavascriptExecutor)driver).executeScript("window.open()");
		  Set<String>allwind=driver.getWindowHandles();
		  System.out.println(allwind.size());
		  
		//  driver.execute_script('''window.open("http://google.com","_blank");''')
//		  Robot r=new Robot();
//
//		  r.keyPress(17);
//		  r.keyPress(16);
//		  r.keyPress(78);
//		  r.keyRelease(17);
//		  r.keyRelease(16);
//		  r.keyRelease(78);
		 // ((JavascriptExecutor)driver).executeScript("window.open()");
	
		 // String link="https://wordpress.com/start";
		 // ((JavascriptExecutor)driver).executeScript("window.open(https://wordpress.com/start,'_blank');");
		//  String a = "window.open(https://wordpress.com/start,'_blank');"; 
	//((JavascriptExecutor)driver).executeScript(a);
	
	  }
  @Test(enabled=false)
  public void readExcel() throws IOException {
	  File src=new File("C:\\Users\\hp\\Documents\\MySheet.xlsx");
	  FileInputStream fisin=new FileInputStream(src);
	  
	  wb=new XSSFWorkbook(fisin);
	   sheet=wb.getSheetAt(0);
	   for(int i=0;i<=2;i++) {
	  String exceldata=	sheet.getRow(i).getCell(0).getStringCellValue();
	  String exceldata1=	sheet.getRow(i).getCell(1).getStringCellValue();
	  System.out.println(exceldata);
	  System.out.println(exceldata1);
	 }
  }
  @Test(enabled=false)
  public void writeExcel() throws IOException {
	  File src=new File("C:\\Users\\hp\\Documents\\MySheet.xlsx");
	
FileInputStream fisin=new FileInputStream(src);
	  
	wb=new XSSFWorkbook(fisin);
	   sheet=wb.getSheetAt(0);
	 sheet.getRow(0).createCell(2).setCellValue("pass");
	 sheet.getRow(1).createCell(2).setCellValue("fail");
	 FileOutputStream fout=new FileOutputStream(src);
	 
	 wb.write(fout);
	 }
  
  @Test(enabled=false)
  public void wordpresslogin() throws IOException, InterruptedException {
	
	  System.out.println("Lets start testing");
	  File src=new File("C:\\Users\\hp\\Documents\\MySheet.xlsx");
	  FileInputStream fisin=new FileInputStream(src);
	  
	  wb=new XSSFWorkbook(fisin);
	   sheet=wb.getSheetAt(0);
	   FileOutputStream fout=new FileOutputStream(src);
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://wordpress.com/log-in");
	   System.out.println(driver.getCurrentUrl());
	   driver.manage().window().maximize();
	   WebElement username=driver.findElement(By.id("usernameOrEmail"));
	   WebElement login=driver.findElement(By.xpath("//button[@class='button form-button is-primary']"));
	   for(int i=0;i<=0;i++) {
		   String exceldata=	sheet.getRow(i).getCell(i).getStringCellValue();
	 
	   username.sendKeys(exceldata);
	   login.click();
	   Thread.sleep(200);
	   if(driver.findElement(By.xpath("//a[contains(text(),'Back')]")).getText().equalsIgnoreCase("Back to WordPress.com")) {
		   sheet.getRow(i).createCell(i+1).setCellValue("pass");
		   wb.write(fout);
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[contains(text(),'Back')]")).click();
	   }
	   else {
		   sheet.getRow(i).createCell(i+1).setCellValue("fail");
		   wb.write(fout);
	   }
	   
//	 String p1=  driver.findElement(By.xpath("//a[contains(text(),'Back')]")).getText();
//	 System.out.println(p1);//Back to WordPress.com
	   }
  }
  
  @DataProvider //(name="wordpressdata")
  public Object[][]passdata(){
	  Object[][]data=new Object[3][2];
	  data[0][0]="joy";
	  data[0][1]="wrong";
	  
	  data[1][0]="joychow20";
	  data[1][1]="Feb12@1993";
	  
	  data[2][0]="joychow20900";
	  data[2][1]="Feb12@1993";
	  return data;
  }
  
  
  @DataProvider(name="wordpressdataexcel")
  public Object[][]passdataexcel(){
	  
	  ExcelDataConfig1 config=new ExcelDataConfig1("C:\\Users\\hp\\Documents\\MySheet.xlsx");
	 int rows= config.getrowcount(0);
	  Object[][]data=new Object[rows][2];
	 for(int i=0;i<rows;i++) {
	data[i][0]=config.getData(0, i, 0);	 
	data[i][1]=config.getData(0, i, 1);	 
	 }
	 return data;
  }
  
  
  
  
  @Test(enabled=false,dataProvider="wordpressdata")
 
  public void wordpressloginTest(String uname,String pwd) throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://wordpress.com/log-in");
	   System.out.println(driver.getCurrentUrl());
	   driver.manage().window().maximize();
	   WebElement username=driver.findElement(By.id("usernameOrEmail"));
	   username.sendKeys(uname);
	   WebElement cont=driver.findElement(By.xpath("//button[@class='button form-button is-primary']"));
	   cont.click();
	   Thread.sleep(800);
	   WebElement password=driver.findElement(By.id("password"));
	 
	   System.out.println(password.isDisplayed());
	   if(password.isDisplayed()==false) {
		   driver.close();
	   }
	
	   password.sendKeys(pwd);
	   WebElement login=driver.findElement(By.xpath("//button[@class='button form-button is-primary']"));
	   login.click();
	   System.out.println(driver.getTitle());
	  
	   driver.quit();
  }
  @Test(enabled=false,dataProvider="wordpressdataexcel")
  public void wordpressloginExcel(String uname,String pwd) throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://wordpress.com/log-in");
	   System.out.println(driver.getCurrentUrl());
	   driver.manage().window().maximize();
	   WebElement username=driver.findElement(By.id("usernameOrEmail"));
	   username.sendKeys(uname);
	   WebElement cont=driver.findElement(By.xpath("//button[@class='button form-button is-primary']"));
	   cont.click();
	   Thread.sleep(800);
	   WebElement password=driver.findElement(By.id("password"));
	 
	   System.out.println(password.isDisplayed());
//	   if(password.isDisplayed()==false) {
//		   driver.close();
//	   }
	
	   password.sendKeys(pwd);
	   WebElement login=driver.findElement(By.xpath("//button[@class='button form-button is-primary']"));
	   login.click();
	   System.out.println(driver.getTitle());
	  
	 //  driver.quit();
  }
  
	  public void t() {
		    //	WebElement start=driver.findElement(By.xpath("//div[contains(@class,'circle extra-small center clickable"+i+""));
		    	String sarr[]= {"amber","red","green","blue"};
		    	for(int i=0;i<4;i++) {
		    		System.out.println(sarr[i]);
		    		WebElement start=driver.findElement(By.xpath("//div[contains(@class,'circle extra-small center clickable"+sarr[i]+""));
		    	}
  }
  

  
  
  
 @AfterMethod
//public void teardown(ITestResult result) throws IOException{
//	 if(ITestResult.FAILURE==result.getStatus()){
//		 screenshot(driver, result.getName());
//		}
//		
//
//		driver.quit();
//	
// }
//if(ITestResult.FAILURE==result.getStatus()){
//	 ExcelDataConfig1 config=new ExcelDataConfig1("C:\\Users\\hp\\Documents\\MySheet.xlsx");
//	 File src=new File("C:\\Users\\hp\\Documents\\MySheet.xlsx");
//		
//	 FileInputStream fisin=new FileInputStream(src);
//  wb=new XSSFWorkbook(fisin);
//  sheet=wb.getSheetAt(0);
// // for(int i=0;i<rows;i++) {
//sheet.getRow(0).createCell(2).setCellValue("fail");
//
//FileOutputStream fout=new FileOutputStream(src);
//
//wb.write(fout);
//  }
//driver.quit();
//	}
//// }
////		
////
////		driver.quit();
////	}
//  /*File src=new File("C:\\Users\\hp\\Documents\\MySheet.xlsx");
//	
//FileInputStream fisin=new FileInputStream(src);
//	  
//	wb=new XSSFWorkbook(fisin);
//	   sheet=wb.getSheetAt(0);
//	 sheet.getRow(0).createCell(2).setCellValue("pass");
//	 sheet.getRow(1).createCell(2).setCellValue("fail");
//	 FileOutputStream fout=new FileOutputStream(src);
//	 
//	 wb.write(fout);
//	 }*/
  
  @AfterTest
  public void afterTest() throws IOException {
	//  wb.close();
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












































}
