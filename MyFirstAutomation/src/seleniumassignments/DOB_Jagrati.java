package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB_Jagrati {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//select date
		WebElement dayDropDown = driver.findElement(By.id("day"));
	Select dayselect = new Select(dayDropDown);
	
       //dayselect.selectByValue("4");
      // dayselect.selectByIndex(3);
       dayselect.selectByVisibleText("4");
       //select month
       WebElement monthDropdown = driver.findElement(By.id("month"));
       Select monthselect = new Select(monthDropdown);
       //monthselect.selectByValue("10");
       monthselect.selectByIndex(9);
       //monthselect.selectByVisibleText("Oct");
     //select year
       WebElement yearDropdown = driver.findElement(By.id("year"));
       Select yearSelect = new Select(yearDropdown);
       //yearSelect.selectByVisibleText("1990");
       //yearSelect.selectByIndex(150);
       yearSelect.selectByValue("1990");
	}

}
