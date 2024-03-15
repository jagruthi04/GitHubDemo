package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com/");//trigger the main url
		String gmailLoginTitle = driver.getTitle();
		//title of the page
		System.out.println("gmailLoginTitle= " + gmailLoginTitle);
		

	}

}
