package pckg23052020;


import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;




public class Test1 {
	// WebDriver driver;
	 RemoteWebDriver driver;
	 @Test(enabled=false)//(priority=0)
	 public void geckodrivertest() {
		 
		 System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		   driver=new FirefoxDriver();
		   driver.get("https://www.google.com");
		   throw new SkipException("test skipped");
	 }
	 @Test(enabled=false)
	 public void hardassert() {//cannot use try catch block as it is an error
		 String actual="actual";
		  String expected="expected";
		  //try {
		  Assert.assertEquals(expected, actual);
		  System.out.println("continue with test");
		  
		  //}
		 // catch(Exception e) {
			  System.out.println("After failure");
			 // System.out.println(e.getStackTrace());
		 // }
			  
		  
		  }
	 
	 @Test(enabled=false)
	  public void assertsoft() {
		  SoftAssert softAssertion= new SoftAssert();
		  String actual="actual";
		  String expected="actual";
		 softAssertion.assertEquals(actual,expected);
		// 
		 System.out.println("Lets start testing");
		 softAssertion.assertAll();
		 
		 
		 
	 }
	 
  @Test//(enabled=false)//(priority=1)
  public void f() throws IOException {
	  System.out.println("Lets start testing");
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("http://www.facebook.com");
	 // Screenshot screenshot = new AShot().takeScreenshot(driver);
	  //WebElement signin=driver.findElement(By.id("u_0_2"));//u_0_13
	  WebElement signin=driver.findElement(By.id("u_0_13"));
	//  AShot screenshot1=   AShot.coordsProvider(new WebDriverCoordsProvider());
	//  Screenshot screenshot = new AShot().takeScreenshot(driver, 
	//  driver.findElement(By.id("u_0_13")));

	//  ImageIO.write(screenshot.getImage(), "PNG", new File("c:\\Drivers\\div_element.png"));
	  
		//ImageIO.write(screenshot.getImage(), "jpg", new File("c:\\ElementScreenshot.jpg"));
		//TakesScreenshot scrShot =((TakesScreenshot)driver);
		//File src=scrShot.getScreenshotAs(OutputType.FILE);
		//File src=scrShot.getScreenshotAs(OutputType.FIL);
		//File DestFile=new File("C:\\Drivers\\fb.jpg");
		//FileUtils.copyFile(src, DestFile);


	
		// TODO Auto-generated catch block
		
	}
	  
	 
  @AfterTest (enabled=false)
  public void teardown() {
	  System.out.println("Test completed.Check in console if it passed or failed");
	  driver.quit();
  }
}
