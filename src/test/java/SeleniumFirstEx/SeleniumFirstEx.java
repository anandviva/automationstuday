package SeleniumFirstEx;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumFirstEx {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://medium.com/@meM03/cannot-find-the-declaration-of-element-project-in-pom-xml-1f06c8c73720");
		driver.manage().window().maximize();
		String s= driver.getTitle();
	
		
		if (s.equals("M-Medium"))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
		driver.close();
		

	}

}
