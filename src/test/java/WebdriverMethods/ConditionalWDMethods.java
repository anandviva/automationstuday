package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalWDMethods {
	
	/* Conditional Methods - Access through only in web element
	 * 
	 * it returns true/false
	 * 
	 * isSelected() -> we can use to check the element is selected or not
	 * isDisplayed() -> We can check the display status of the element
	 * isEnabled() -> we can check the enable/disabale status of the element
	 * 
	 * isSelected() - Use for radio button and checkbox. sometimes in dropdowns
	 * isEnabled() - input box, dropdown, radio button and checkbox
	 * isDisplayed() -Mostly we use for logos
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/en-gb/catalog/desktops");
		
		WebElement logo = driver.findElement(By.xpath("//img[@title='Your Store']"));
		System.out.println(logo.isDisplayed());
		
		WebElement inputfield = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		System.out.println(inputfield.isEnabled());
		
		
		
	}

}
