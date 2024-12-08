package WebdriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	
	/*  Nvaigation Command
	 * 
	 * 1.navigate.to(url)
	 * 2.navigate.back()
	 * 3.navigate.forward()
	 * 4.navigate.refres()
	 * 
	 * 
	 * driver.get() - Accepts URL in string format only
	 * 1.navigate.to() - Accepts URL in string format and URL object format
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().to("https://demo.opencart.com/en-gb/catalog/desktops");// Can use this one also
		driver.navigate().to("https://demo.opencart.com/en-gb/catalog/software");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); //https://demo.opencart.com/en-gb/catalog/desktops
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); //https://demo.opencart.com/en-gb/catalog/software
		
		
		driver.navigate().refresh();
		
		
		
		
		
		
		

	}

}
