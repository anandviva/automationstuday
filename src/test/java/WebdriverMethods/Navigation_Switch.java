package WebdriverMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Switch {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy.']")).click();
	    
	   Set<String> windowids = driver.getWindowHandles();
	   
	   //Need to set to list because in set we don't have the get method obtain element one by one. List we can obtain element by inedex
	    //Approach 1
	   List<String> windowidlist = new ArrayList(windowids);
	   
	       String ParentwindowID = windowidlist.get(0);
	       String ChildwindowID  = windowidlist.get(1);
	       
	       //Now we are switching one window to another one 
	       // Driver point will switch one to another 
	       driver.switchTo().window(ChildwindowID);
	       System.out.println(driver.getTitle());
	       
	       
	       driver.switchTo().window(ParentwindowID);
	       System.out.println(driver.getTitle());
	       
	   // Approach 2 
	       
	       
	      /* for (String x:windowids )
	       {
	    	   String Title = driver.switchTo().window(x);
	    	   
	    	   if (Title.equals("OrangeHRM"))
	    	   {
	    		   System.out.println(driver.getCurrentUrl());
	    		   
	    		  //Some validation can apply for parent window
	    	   }
	       }
	       */
	       
	   
	   
	 
	
		
		

	}

}
