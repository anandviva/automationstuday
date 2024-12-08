package SeleniumFirstEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaCSSSelectors {
	
	/* CSS - cascade Style Sheets
	 * 
	 *  tag id ---> tag#id
	 *  tag class ---> tag.class 
	 *  tag attribute --> tag[attribute="value"]
	 *  tag class attribute ---> tag.class[attribute="value"]
	 *  
	 *  tag class ---> we can use for locating group of elements. generally tag and class have multiple group of ele.
	 *  
	 *  tag class attribute ---> we can use for specific lements. in any tag and class if want locate particular elements we use
	 * 
	 */
  
	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/");
		driver.get("https://demo.opencart.com/");
	
		
		driver.manage().window().maximize();
		
		// 1. tag id ---> tag#id
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Tablet");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Tablet"); // can remove the tag name. tag is optional
		
		//2.tag class ---> tag.class
		
		    // If the calss name "form-control form-control-lg" has space we need to take first one
		
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("Tablet");
		//driver.findElement(By.cssSelector(".form-control")).sendKeys("Tablet"); // tag is optional
		
		// 3.tag attribute --> tag[attribute="value"]
		
		//driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("Tablet");
		
		//driver.findElement(By.cssSelector("[placeholder='Search']")).sendKeys("Tablet");  // tag is optional
		
		// 4. tag class attribute ---> tag.class[attribute="value"]
		
		//driver.findElement(By.cssSelector("input.form-control[name='search']")).sendKeys("Tablet");
		driver.findElement(By.cssSelector(".form-control[name='search']")).sendKeys("Tablet");// tag is optional
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
