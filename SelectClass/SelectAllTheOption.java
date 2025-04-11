package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllTheOption 
{
	public static void main(String[]args) throws InterruptedException 
	{
		//open browser
		WebDriver driver = new ChromeDriver();
		//maximize the screen
		driver.manage().window().maximize();
		//open the DWS site
		driver.get("file:///C:/Users/Vishal/Downloads/demo-1.html");
		Thread.sleep(2000);
		// Create Object Og Select
		WebElement single_Select = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(single_Select);
		List<WebElement> options = sel.getOptions();
		for(WebElement web : options )
		{
			web.click();
			Thread.sleep(2000);
		}
}
}