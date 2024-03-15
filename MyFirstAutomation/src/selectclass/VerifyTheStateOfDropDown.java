package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyTheStateOfDropDown {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select monthselect = new Select(monthdropdown);
      if(monthselect.isMultiple())
      {
    	  System.out.println("the drop down is multiselected");
      }
      else {
    	  monthselect.selectByVisibleText("Dec");
      }
      }}
      
