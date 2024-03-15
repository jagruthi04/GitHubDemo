package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfName {

	public static void main(String[] args) 
	{
		
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
   //WebElement emailOrMobileNotextfield = driver.findElement(By.name("email"));
    
  // emailOrMobileNotextfield.sendKeys("JSP");
    WebElement emailOrMobileNotextfield = driver.findElement(By.cssSelector(" input[placeholder='Email address or mobile number']"));
    emailOrMobileNotextfield.sendKeys("QSP");
	}

}
