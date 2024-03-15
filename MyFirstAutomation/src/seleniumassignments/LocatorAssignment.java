package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/en/login");
		
		 WebElement loginID = driver.findElement(By.id("user"));
		
           loginID.sendKeys("tiwari.jagrati23@gmail.com");
           WebElement loginID1 = driver.findElement(By.id("login"));
           loginID1.click();
	}

}
