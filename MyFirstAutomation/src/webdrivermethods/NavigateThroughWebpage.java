package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateThroughWebpage {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaafashion.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.nykaafashion.com/women/c/6557?");
		Thread.sleep(3000);
		driver.navigate().to("https://www.nykaafashion.com/men/c/6823?");
		Thread.sleep(3000);
		driver.navigate().to("https://www.nykaafashion.com/all-brands?");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().to("https://www.nykaafashion.com/app");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
