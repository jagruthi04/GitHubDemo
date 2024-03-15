package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClickMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
	    WebElement forgottenPwdLink = driver.findElement(By.linkText("Forgotten password?"));
		forgottenPwdLink.click();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();		
				}

}
