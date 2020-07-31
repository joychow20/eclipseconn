package Barclays_Client;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_dropdown {
	WebDriver driver;

	public void startBrowser() {

		System.out.println("Lets start testing");
//		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@Test(enabled = false)
	public void noMultipleSelect() {
		this.startBrowser();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select ddown = new Select(driver.findElement(By.xpath("//select[@name='country']")));

		if (ddown.isMultiple() == true) {
			ddown.deselectAll();
		} else {

			List<WebElement> countries = driver.findElements(By.xpath(
					"/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[11]/td[2]/select[1]/option"));
			for (WebElement c : countries) {
				if (c.getText().equalsIgnoreCase("INDIA")) {
					ddown.selectByVisibleText(c.getText());
				}
			}

		}
	}

	@Test

	public void MultipleSelect() {
		this.startBrowser();
		driver.get("http://output.jsbin.com/osebed/2");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		System.out.println(String.valueOf(js.executeScript( "return document.readyState")));
		Select ddown = new Select(driver.findElement(By.id("fruits")));

		if (ddown.isMultiple() == true) {
			// ddown.deselectAll();
			List<WebElement> fruits = driver.findElements(By.xpath("//option"));
			ddown.getAllSelectedOptions();
			for (WebElement c : fruits) {
				System.out.println(c.getText());

				ddown.selectByVisibleText("Apple");
				ddown.selectByVisibleText("Banana");
				ddown.deselectAll();
			}
		} else {

			List<WebElement> fruits1 = driver.findElements(By.id("fruits"));
			for (WebElement c1 : fruits1) {
				if (c1.getText().equalsIgnoreCase("Apple")) {
					ddown.selectByVisibleText(c1.getText());
				}
			}
		}
	}

}