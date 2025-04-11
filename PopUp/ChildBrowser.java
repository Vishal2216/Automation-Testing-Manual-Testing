package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowser
{

	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into demowebshop
		driver.get("http://demowebshop.tricentis.com/");
		String parent_handle = driver.getWindowHandle();
		System.out.println (parent_handle);
		Actions act = new Actions(driver);
		Thread.sleep(2001);
		act.keyDown(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//a[text() ='Facebook']")).click();
		Thread.sleep(2000);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		child.remove(parent_handle);
		for (String str : child )
		{
			driver.switchTo().window(str);
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		
		
}
}