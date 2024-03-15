package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyPwdTxtFldClr {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement PwdTxtFldClr = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		PwdTxtFldClr.click();
		String PwdTxtFldBg = PwdTxtFldClr.getCssValue("background-color");
		System.out.println("PwdTxtFldBg="+ PwdTxtFldBg);
		String PwdHexConvr = Color.fromString(PwdTxtFldBg).asHex();
		System.out.println("PwdHexConvr="+PwdHexConvr);
		driver.manage().window().minimize();
		driver.quit();
	}

}
