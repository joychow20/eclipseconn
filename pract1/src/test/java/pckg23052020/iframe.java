package pckg23052020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class iframe {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/"); 
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iframes are " + iframeElements.size());

		JavascriptExecutor js = (JavascriptExecutor) driver;
    	Integer noOfFrames = Integer.parseInt(js.executeScript("return window.length").toString());
    	System.out.println("No. of iframes on the page are " + noOfFrames);
		}
}
