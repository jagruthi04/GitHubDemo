package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("kacha_badam@genius");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("123erasf566");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Log in']")).click();
  
       
        
	}

}
