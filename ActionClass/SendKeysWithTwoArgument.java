package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithTwoArgument 
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
	WebElement search_field = driver.findElement(By.className("search-box-text ui-autocomplete-input"));
	act.sendKeys(search_field,"sunglasses").perform();
}
}