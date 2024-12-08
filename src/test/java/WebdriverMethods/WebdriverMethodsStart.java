package WebdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodsStart {
	
	
	/* Web Driver Methods 
	 * 
	 * 1. Get methods
	 * 2. Conditional methods
	 * 3. Browser methods
	 * 4. Navigational methods
	 * 5. Wait methods
	 * 
	 * Get methods - we can access these methods through webdriver instance
	 *               Can be accessed only in web page level not in web element
	 * 
	 * get() - Open the URL of the page
	 * getTitle() - returns title of the page
	 * getCurrentURL() - returns current URL of the page
	 * getPageSource()- returns page source code
	 * getWindowHandle()- return ID of the single browser window
	 * getWindowHandles()- return ID of the multiple browser window
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// get method
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		
		//getTitle()
		
		System.out.println(driver.getTitle());
		
		//getPageSource()- returns page source code
		
		System.out.println(driver.getPageSource());
		
		// getCurrentURL() - returns current URL of the page
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		//getWindowHandle()- return ID of the single browser window
		
		System.out.println(driver.getWindowHandle()); // return type is string getting value in dyanamicaly. everytime id will be varied
	
		//getWindowHandles()- return ID of the multiple browser window
		
		Set<String> windowmultiID = driver.getWindowHandles();
		
		System.out.println(windowmultiID);// return type is set

	}

}
