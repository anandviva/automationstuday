package WebdriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {
	
	/* Wait methods 
	 * 
	 * Web driver has two wait methods 
	 * 
	 * implicit wait 
	 * explicitwait/fluent wait
	 * 
	 * 
	 * Thread.sleep() -> isn't a web driver method wait method
	 * 
	 * 	Gnerally we are getting the two excepton , if driver can't locate the element
	 * 
	 * 
	 *  NosuchElement exception - Locator is incorrect but the page response is getting delay so that occurs
	 *  Element not found exception - If locator(Xpath/locator) is incorrect
	 *  
	 * 
	 * 
	 *  Thread.sleep() -> Java command/method
	 *  
	 *  Adv: Easy to use 
	 *  
	 *  Dis Adv:
	 *  
	 *  1) If the time isn't sufficient then you will get an exception
	 *  2) It will wait for maximum time out (If the element take less time. this will reduce the performance of the script 
	 *  3) Multiple time we need to use.
	 *  
	 *  
	 *  
	 * implicit wait 
	 * 
	 * adv:
	 * 
	 *  1) SIngle time/one statement is enough
	 *  2) It will not wait for maximum time out id the element is avialble (If the element take less time it moves on next statement)
	 *  3) Applicable for all the elemsnts
	 *  4) Easy to use 
	 *  
	 * Dis adv
	 * 
	 * 1) If the time isn't sufficient then you will get an exception
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // 5 seconds need to enter manually 
		
		/* Once create the web driver class, we define the implicit wait and it will be applicable for all statement 
		 * until driver.close or driver.quit
		 * 
		 * we define 5 seconds it will will wait for finding the element maximum five seconds if won't get the element within 5 secs
		 * throws exception
		 * 
		 * if the elements gets within 5 sces (1 s or 2s) it execute the next step and won't wait for 5 secs like sleep
		 * 
		 * we no need to write the multiple time for implicit wait. after web driver class we can declare once 
		 * 
		 *  
		 */
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		driver.close();
		
		/*
		 * 
		 * 
		 * ----------------------------
		 * 
		 * Explicit methods
		 * 
		 * 
		 */
		
		
		
		//WebDriver driver = new ChromeDriver();
		
		//explicit wait declaration
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));// pass the value constructor 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Apply or use the condition. the wait will be applicable for this statement
		
		// no need to write the find element because the below statement returns the web element
		WebElement linktext = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("OrangeHRM, Inc")));// pass the webelement
		
		linktext.click();
		
		
	
		

	}

}
