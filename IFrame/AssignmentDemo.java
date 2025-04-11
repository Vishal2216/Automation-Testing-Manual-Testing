package IFrame;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into demoworkshop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).perform();
		act.keyDown(Keys.PAGE_DOWN).perform();
}
}