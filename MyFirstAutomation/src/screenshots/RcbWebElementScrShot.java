package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RcbWebElementScrShot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String timestamp = LocalDateTime.now().toString().replace(':', '-');
		driver.get("https://www.royalchallengers.com/");
		WebElement rcblogo = driver.findElement(By.xpath("//div[@class='hdr-logo']"));
	 File tempfile = rcblogo.getScreenshotAs(OutputType.FILE);
		File permfile = new File("./webelementsSS/"+timestamp+"rcblogoss.png");
		FileUtils.copyFile(tempfile, permfile);
		driver.manage().window().minimize();
		driver.quit();
	}
	
	

}
