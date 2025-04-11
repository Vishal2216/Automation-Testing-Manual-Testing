package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		 driver.manage().window().maximize();																																																																																	
		//waiting condition
		Thread.sleep(2000);
		//enter into demowebshop
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		act.moveToElement(men).perform();
	    driver.findElement(By.xpath("//a[text()='Jackets']")).click();
		

}
}