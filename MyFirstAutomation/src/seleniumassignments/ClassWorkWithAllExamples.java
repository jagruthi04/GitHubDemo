package seleniumassignments;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkWithAllExamples {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.get("https://www.gmail.com/");
		driver.get("https://www.meesho.com/");
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.meesho.com/");
		String meeshoLoginTitle = driver.getTitle();
		System.out.println("meeshoLoginTitle=" + meeshoLoginTitle);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/");
		String myntraHomepageUrl = driver.getCurrentUrl();
		System.out.println("myntraHomepageUrl=" + myntraHomepageUrl);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		Set<String> allWids = driver.getWindowHandles();
		
		for(String wid:allWids)
		{
			String widUrl = driver.switchTo().window(wid).getCurrentUrl();
			System.out.println(widUrl);
			if(widUrl.equals("https://www.myntra.com/"))
			{
				System.out.println(wid);
			}
			else if (widUrl.equals("https://www.gmail.com/"))
			{
				System.out.println(wid);
			}
			else if (widUrl.equals("https://www.meesho.com/"))
			{
				System.out.println(wid);
			}
				
			else if(widUrl.equals("https://www.facebook.com/"))
			{
				int childWidHeight = driver.manage().window().getSize().getHeight();
				System.out.println("childWidHeight=" + childWidHeight);
				int childWidWidth = driver.manage().window().getSize().getWidth();
				System.out.println("childWidWidth=" + childWidWidth);
				int childWidXaxis=driver.manage().window().getPosition().getX();
				System.out.println("childWidXaxis=" + childWidXaxis);
				int childWidYaxis=driver.manage().window().getPosition().getY();
				System.out.println("childWidYaxis=" + childWidYaxis);
				Dimension definedSize = new Dimension(500,500);
				driver.manage().window().setSize(definedSize);
				Point definedPosition = new Point(80,120);
				driver.manage().window().setPosition(definedPosition);
				Thread.sleep(2000);	
				driver.close();
			}
		}
		
		
		

	}

}
