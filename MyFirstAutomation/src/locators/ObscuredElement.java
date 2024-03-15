package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObscuredElement {

	public static void main(String[] args) throws InterruptedException 
	{
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]/..//input[@type='submit']")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Customer Service")).click();
Thread.sleep(2000);


	}

}
