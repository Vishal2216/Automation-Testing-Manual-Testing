package ActionClass;


import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scolling 
{
	public static void main(String[] args) throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	//maximize the browser
	 driver.manage().window().maximize();																																																																																	
	//waiting condition
	Thread.sleep(2000);
	//enter into demowebshop
	driver.get("https://demowebshop.tricentis.com/");
	Actions act= new Actions(driver);
	Thread.sleep(2000);
	act.keyDown(Keys.PAGE_DOWN).perform();
	act.keyUp(Keys.PAGE_DOWN).perform();
	act.keyDown(Keys.PAGE_UP).perform();
	act.keyUp(Keys.PAGE_UP).perform();
}
}