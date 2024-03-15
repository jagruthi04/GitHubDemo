package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB_Jagrati {

	public static void main(String[] args) throws InterruptedException
	{
		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/signup");
//select date
WebElement dayDropDown = driver.findElement(By.id("day"));
Select dayselect = new Select(dayDropDown);
dayselect.selectByIndex(3);
Thread.sleep(2000);
//select month
WebElement monthDropdown = driver.findElement(By.id("month"));
Select monthselect = new Select(monthDropdown);
monthselect.selectByValue("10");
Thread.sleep(2000);
//select year
WebElement yearDropdown = driver.findElement(By.id("year"));
Select yearSelect = new Select(yearDropdown);
yearSelect.selectByVisibleText("1990");
Thread.sleep(2000);
	}

}
