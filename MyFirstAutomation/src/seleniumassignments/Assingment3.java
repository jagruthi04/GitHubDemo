package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment3 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement signupbutton = driver.findElement(By.name("websubmit"));
		signupbutton.click();
		Thread.sleep(2000);
		WebElement alreadyhaveanaccount = driver.findElement(By.cssSelector("a[aria-label='Already have an account?']"));
		alreadyhaveanaccount.click();
		Thread.sleep(2000);
		WebElement loginbutton1 = driver.findElement(By.cssSelector("input[aria-label='Email address or phone number']"));
		loginbutton1.sendKeys("tiwari.jagrati2gmail.com");
		Thread.sleep(2000);
		WebElement login2 = driver.findElement(By.id("loginbutton"));
	        login2.click();
	       
	      
	
		
					
		
		

	}

}
