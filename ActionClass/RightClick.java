package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		 driver.manage().window().maximize();																																																																																	
		//waiting condition
		Thread.sleep(2000);
		//enter into demowebshop
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		//act.moveToElement(right_click).perform();
		//act.contextClick().perform();
		act.moveToElement(right_click).contextClick().perform();
		driver.findElement(By.xpath("//span[text()='Paste']")).click();
		Thread.sleep(2000);
		try
		{
			right_click.click();
			System.out.println("Popup is not displayed");
		}
		catch(Exception e)
		{
			System.out.println("Popup is displayed");
		}
		Thread.sleep(2000);
}
}