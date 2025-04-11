package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetPageHandles 
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
		System.out.println(parent_handle);
		Actions act = new Actions (driver);
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//a[text() ='Facebook']")).click();
		Thread.sleep(2000);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		
}
}