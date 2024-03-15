package seleniumassignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenShot {

	public static void main(String[] args) throws IOException 
	{
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.the-maharajas.com/");
TakesScreenshot ts = (TakesScreenshot)driver;
File temporary = ts.getScreenshotAs(OutputType.FILE);
File permanent = new File("./errorshots/MaharajaExpressWebpageScrShot.png");
FileUtils.copyFile(temporary, permanent);
driver.manage().window().minimize();
driver.quit();

	}

}
