package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CorrectUsageOfId {

	public static void main(String[] args) throws InterruptedException
	{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.facebook.com/");
Thread.sleep(2000);

      WebElement emailTextField = driver.findElement(By.id("email"));
     // WebElement emailTextField = driver.findElement(By.id("emai"));------NoSuchElementFoundException if we dont write proper address
      
      emailTextField.sendKeys("tiwari.jagrati23@gmail.com");
      
      
}

}
