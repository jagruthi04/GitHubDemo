package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheToolTip {

	public static void main(String[] args) 
	{
		
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
WebElement flipkartLogo = driver.findElement(By.xpath("//img[@title='Flipkart']"));
   String logoToolTip=flipkartLogo.getAttribute("title");
        System.out.println("logoToolTip="+logoToolTip);
        driver.manage().window().minimize();
        driver.quit();
	}

}
