package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class CreateNewAccount
{
	
   public static void main(String[] args) 
   {
	
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	 WebElement CreateAccountClr = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
	 String CreateAccBgClr = CreateAccountClr.getCssValue("background-color");
	  System.out.println("CreateAccBgClr = " + CreateAccBgClr);
	  String CreateAccountHexacode = Color.fromString(CreateAccBgClr).asHex();
	  System.out.println("CreateAccountHexacode = " +CreateAccountHexacode);
	 
	  driver.manage().window().minimize();
	  driver.quit();
	 
}
	}



