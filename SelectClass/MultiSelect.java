package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect 
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
		WebElement multi_Select = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(multi_Select);
		// DeselectByVisibleText
		sel.selectByVisibleText("BMW");
		Thread.sleep(2000);
		sel.selectByValue("lr");
		Thread.sleep(2000);
	sel.selectByIndex(10);
	Thread.sleep(2000);
//	sel.deselectByVisibleText("BMW");
//	Thread.sleep(2000);
//	sel.deselectByValue("lr");
//	Thread.sleep(2000);
//	sel.deselectByIndex(10);
//	
	sel.deselectAll();
	System.out.println(sel.isMultiple());
	}

	}


