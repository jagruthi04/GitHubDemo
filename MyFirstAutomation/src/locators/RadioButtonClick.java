package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonClick 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']"));
		//WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Female']/..//input[@type='radio']"));
		//WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']"));
		//both way we can do
		WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Custom']"));
		//WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Female']"));
		//WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Male']"));
		customRadioButton.click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
