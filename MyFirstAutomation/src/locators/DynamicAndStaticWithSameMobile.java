package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicAndStaticWithSameMobile 
{

	public static void main(String[] args)
	{
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[text()='Redmi Note 7 Pro (Moonlight White, 128 GB)']/../..//div[@class='_30jeq3 _1_WHN1']")).click();
            
	}

}
