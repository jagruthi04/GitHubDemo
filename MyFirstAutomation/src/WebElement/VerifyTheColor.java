package WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyTheColor {

	public static void main(String[] args) 
	{
	 
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginbuttonColor = driver.findElement(By.name("login"));
		String loginbackgroundclr = loginbuttonColor.getCssValue("background-color");
	   System.out.println("loginbackgroundclr = " + loginbackgroundclr );
	   String ConvertedValue = Color.fromString(loginbackgroundclr).asHex();
	   System.out.println("ConvertedValue ="+ ConvertedValue);
	   driver.manage().window().minimize();
		driver.quit();
	}

}
