package SeleniumFirstEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaLocators {

	/* Java Locators
	 * 
	 * The below for single (Specific) web element
	 * ----------------------------------- 
	 *  id
	 *  name
	 *  Link text
	 *  Partial link text
	 *  
	 *  Multiple (Group of) web elements
	 *  --------------------
	 *  Class 
	 *  Tag
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id  
		
		boolean display = driver.findElement(By.id("logo")).isDisplayed(); //logo is displaying or not
		System.out.println("display");// returns true/false
		
		//Link text and partial link text
		
	     driver.findElement(By.linkText("Desktops")).click();
	     //driver.findElement(By.partialLinkText("Deskt")).click(); // enter the partial name
		
	     
	     //Class for handling multiple (Group of) web elements
	     
	     // In header all the links have same class name so using the class name we can access all the web elements
	     
	     List<WebElement> headerlinks =   driver.findElements(By.className("list-inline-item"));
	     System.out.println("No of web elements :"+ headerlinks.size());
	     
          //Tag for handling multiple (Group of) web elements
	     
	     // In page has n no of images and all have same tag name so using the tag name we can access all the image web elements
		
		
	     List<WebElement> images =  driver.findElements(By.tagName("a"));
	     System.out.println("No of web elements :"+ images.size());
	     
	     
	     /* Difference between findElement and findElements
	     
	     findElement - we use for single/specific element 
	     findElements - we use for multiple/group of elements
	     
	     
	     
	     Below we look what will happen when using findElement  and findElements 
	     
	     Scenario 1 - When Locator matching with single element
	     
	     findElement - Single web element will return type is Web element
	     findElements - Single web element will return type is List<WebElement>
	     
	     Scenario 2 - When Locator matching with multiple (group of) element
	     
	     findElement - Single web element will return type is Web element (the very first element will return)
	     findElements - Single web element will return type is List<WebElement>
	     
	     Scenario 3 - When Locator is not matching with any of the location
	     
	     findElement - NoSuchElementException
	     findElements - 0
		
		
		*/
		

	}

}
