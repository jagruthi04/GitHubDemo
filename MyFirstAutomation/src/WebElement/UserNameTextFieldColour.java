package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class UserNameTextFieldColour {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement UserIdTextField = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
	String UserIDBgClr = UserIdTextField.getCssValue("background-color");
	System.out.println("UserIDBgClr = "+ UserIDBgClr);
	String ConvertedValue = Color.fromString(UserIDBgClr).asHex();
	System.out.println("ConvertedValue= "+ConvertedValue);
	driver.manage().window().minimize();
	driver.quit();
	}

}
