package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait
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
	driver.get("https://shoppersstack.com/");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginBtn']")));
	driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
}
}