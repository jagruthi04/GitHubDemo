package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsExample {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement box = driver.findElement(By.name("search_query"));
		box.sendKeys("API ONLINE CLASSES");
		driver.findElement(By.cssSelector("svg[xmlns='http://www.w3.org/2000/svg']")).click();
	}

}
