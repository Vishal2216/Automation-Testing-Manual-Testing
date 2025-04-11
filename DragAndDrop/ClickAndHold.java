package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold 
{
	public static void main(String[] args) throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	//maximize the browser
	 driver.manage().window().maximize();																																																																																	
	//waiting condition
	Thread.sleep(2000);
	//enter into demowebshop
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Actions act = new Actions(driver);
	Thread.sleep(2000);
	WebElement rome = driver.findElement(By.id("box6"));
	WebElement italy = driver.findElement(By.id("box106"));
	act.clickAndHold(rome).release(italy).perform();
}
}