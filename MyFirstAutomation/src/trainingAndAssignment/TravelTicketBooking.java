package trainingAndAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TravelTicketBooking {

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.goibibo.com/");
	 WebElement canceloption = driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
	 canceloption.click();
	 WebElement roundtripoption = driver.findElement(By.xpath("//p[text()='Round-trip']"));
	 roundtripoption.click();
	 driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();  
	 WebElement fromtextfield = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[1]/div/div[1]/p"));
	 fromtextfield.click();
	 Actions act  =new Actions(driver);
	 act.click(fromtextfield).perform();
	 act.sendKeys(fromtextfield, "Mumbai (BOM)" ).perform();
	 act.pause(1000).perform();
     act.sendKeys(Keys.ENTER).perform();
	 WebElement totextfield = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[2]/div/div/.."));
	 totextfield.click();
	 act.click(totextfield).perform();
	 act.sendKeys(totextfield, "New Delhi,India (DEL)" ).perform(); 
	 act.pause(1000).perform();
	 act.sendKeys(Keys.ENTER).perform();
	 act.pause(1000).perform();
	driver.findElement(By.xpath("//span[text()='Cancel']")).click();
	Thread.sleep(2000);
	WebElement datepicking = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div/p[1]"));
	datepicking.click();
	WebElement deptdate = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[2]/div[3]/p[1]"));
	deptdate.click();
	WebElement returndate = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[1]/div[2]/p[1]"));
	returndate.click();
	WebElement returndatepic = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div[6]/p[1]"));
	returndatepic.click();
	driver.findElement(By.xpath("//span[text()='Done']")).click();
	Thread.sleep(4000);
	WebElement passengersno = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[5]/div[2]/div[1]/div/p[1]"));
	passengersno.click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[5]/div[2]/div[3]/a[1]")).click();
	driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
	Thread.sleep(3000);
	//driver.manage().window().minimize();
	//driver.quit();
	}}
