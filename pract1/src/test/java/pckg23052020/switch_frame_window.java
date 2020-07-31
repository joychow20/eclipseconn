package pckg23052020;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class switch_frame_window {
	WebDriver driver;
	 public static void generateAlert(WebDriver driver, String message){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("alert('"+message+"')");

	    }
  @Test(enabled=false)
  public void f() {
	  System.out.println("Lets start testing");
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://demo.guru99.com/popup.php");
	   driver.manage().window().maximize();	
	   Actions act=new Actions(driver);
	   act.sendKeys(Keys.CONTROL+"t");
		
	   driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
	   String MainWindow=driver.getWindowHandle();
	   Set<String>tot_windows=driver.getWindowHandles();
	   int wincount=tot_windows.size();
	   System.out.println(wincount);
	   for(String s:tot_windows) {
		   System.out.println(s);
	   }
	   Iterator<String> i1=tot_windows.iterator();		
		
       while(i1.hasNext())			
       {		
           String ChildWindow=i1.next();		
           		
           if(!MainWindow.equalsIgnoreCase(ChildWindow))			
           {    		
                
                   // Switching to Child window
                   driver.switchTo().window(ChildWindow);	                                                                                                           
                   driver.findElement(By.name("emailid"))
                   .sendKeys("gaurav.3n@gmail.com");                			
                   
                   driver.findElement(By.name("btnLogin")).click();	
                   driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
                   driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
                                
			// Closing the Child Window.
                       driver.close();		
           }	
           driver.switchTo().window(MainWindow);
           generateAlert(driver,"returned to main window");
       }  
  }
       
       @Test
       public void keyboardevent() throws InterruptedException, AWTException {
    	   
    	   System.out.println("Lets start testing for keyboard events");
    		  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
    		   driver=new ChromeDriver();
    		   driver.get("http://demo.guru99.com/popup.php");
    		   driver.manage().window().maximize();	
    		   Robot robot = new Robot();                          
    		   robot.keyPress(KeyEvent.VK_CONTROL); 
    		   robot.keyPress(KeyEvent.VK_T); 
    		   robot.keyRelease(KeyEvent.VK_CONTROL); 
    		   robot.keyRelease(KeyEvent.VK_T);
    		   driver.findElement(By.xpath("//div[@class='logo']//a//img")).click();
    		   Actions act=new Actions(driver);
    		   act.moveToElement(driver.findElement(By.xpath("//div[@class='logo']//a//img"))).perform();
    		   Thread.sleep(380);
    		   act.sendKeys(Keys.CONTROL+"t").build().perform();
       }
 
}
