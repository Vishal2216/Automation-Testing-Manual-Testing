package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
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
	WebElement Source = driver.findElement(By.id("box6"));
	WebElement Target = driver.findElement(By.id("box106"));
	act.dragAndDrop(Source, Target).perform();
	
	Thread.sleep(2000);
	WebElement Source1 = driver.findElement(By.id("box7"));
	WebElement Target1 = driver.findElement(By.id("box107"));
	act.dragAndDrop(Source1, Target1).perform();
	
	Thread.sleep(2000);
	WebElement Source2 = driver.findElement(By.id("box1"));
	WebElement Target2 = driver.findElement(By.id("box101"));
	act.dragAndDrop(Source2, Target2).perform();
	
	Thread.sleep(2000);
	WebElement Source3 = driver.findElement(By.id("box2"));
	WebElement Target3 = driver.findElement(By.id("box102"));
	act.dragAndDrop(Source3, Target3).perform();
	
	Thread.sleep(2000);
	WebElement Source4 = driver.findElement(By.id("box3"));
	WebElement Target4 = driver.findElement(By.id("box103"));
	act.dragAndDrop(Source4, Target4).perform();
	
	Thread.sleep(2000);
	WebElement Source5 = driver.findElement(By.id("box4"));
	WebElement Target5 = driver.findElement(By.id("box104"));
	act.dragAndDrop(Source5, Target5).perform();
	
	Thread.sleep(2000);
	WebElement Source6 = driver.findElement(By.id("box5"));
	WebElement Target6 = driver.findElement(By.id("box105"));
	act.dragAndDrop(Source6, Target6).perform();
}
}