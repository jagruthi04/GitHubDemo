package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MixExample {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("jagrati@gmail.com");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("1234567890");
	    driver.findElement(By.cssSelector("[type=submit]")).click();
	    driver.findElement(By.name("Show")).click();
	    
	//driver.findElement(By.xpath("//label[text()='Custom']")).click();
		//driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[text()='Redmi Note 7 Pro (Moonlight White, 128 GB)']/../..//div[@class='_30jeq3 _1_WHN1']")).click();
		//driver.findElement(By.xpath("(/
	//a[contains (text(),'Elixir Capital')]")).click();

		//driver.get("https://trello.com/");
		//driver.findElement(By.xpath("//a[contains(text(),'Learn more.')]")).click();
}}
