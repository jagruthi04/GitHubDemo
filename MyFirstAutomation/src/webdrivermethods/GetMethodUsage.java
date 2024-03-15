package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodUsage {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("www.myntra");---will get {org.openqa.selenium.InvalidArgumentException: invalid argument}
driver.get("https://www.myntra.com/");
	}

}
