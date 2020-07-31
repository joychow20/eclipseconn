package Barclays_Client;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class parallel {
	WebDriver driver;

	@Test
	public void Method_test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		// Find user name
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.name("uid"));
		// Fill user name
		Thread.sleep(3000);
		userName.sendKeys("guru99");
		// Find password
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.name("password"));
		// Fill password
		Thread.sleep(3000);
		password.sendKeys("guru99");
	}

	@Test
	public void Method_test2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://wwww.facebook.com");

	}

	@AfterTest
	public void teardown() throws IOException {
		double r = Math.random();
		File dest = new File(".//target//ss" + r + ".png");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(src, dest);

		driver.quit();
	}

}
