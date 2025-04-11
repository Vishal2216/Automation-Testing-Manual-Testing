package ActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String expected_url="https://demowebshop.tricentis.com/";
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url = driver.getCurrentUrl();
		if(expected_url.equals(actual_url))
		{
			System.out.println(" i am in dws page ....");
			Thread.sleep(2000);
			Actions act= new Actions(driver);
			Thread.sleep(2000);
			act.keyDown(Keys.TAB).keyDown(Keys.TAB).perform();
			act.sendKeys("one plus earBuds").keyDown(Keys.ENTER).perform();
		}
		else
		{
			System.out.println("i am not in dws page...");
			
		}
		Thread.sleep(2000);
		
	}
}


