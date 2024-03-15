package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheSizeandPositionOfWindow1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");// parent 
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/signup");//child
		Set<String> allWids = driver.getWindowHandles();
		
		for(String wid:allWids)
		{
		String widUrl = driver.switchTo().window(wid).getCurrentUrl();
		System.out.println(widUrl);
		if(widUrl.equals("https://www.facebook.com/")) 
		{
        
	    }
		else if(widUrl.equals("https://www.facebook.com/signup")) 
		{
			int childWidHeight = driver.manage().window().getSize().getHeight();
			System.out.println("childWidHeight=" + childWidHeight);
			int childWidWidth = driver.manage().window().getSize().getWidth();
			System.out.println("childWidWidth=" + childWidWidth);
			int childWidXaxis=driver.manage().window().getPosition().getX();
			System.out.println("childWidXaxis=" + childWidXaxis);
			int childWidYaxis=driver.manage().window().getPosition().getY();
			System.out.println("childWidYaxis=" + childWidYaxis);
			Dimension definedSize = new Dimension(400, 600);
			driver.manage().window().setSize(definedSize);
			Point definedPosition = new Point(100,150);
			driver.manage().window().setPosition(definedPosition);
			Thread.sleep(2000);// will throw exception
	//driver.close();---will close only 1 window and in task manager still application will run so memory will consume
			
		}

        }
		driver.quit();//trmnate d app frm tsk mnger no running app in task manag memory cnsumptn will not be there.
		
		}}
