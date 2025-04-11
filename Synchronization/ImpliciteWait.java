package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteWait
{
public static void main(String[] args) throws InterruptedException 
	
	{
	//open the browser
	ChromeDriver driver = new ChromeDriver();
	//maximize the browser
	 driver.manage().window().maximize();																																																																																	
	//waiting condition
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into demowebshop
	driver.get("https://shoppersstack.com/");
	driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	driver.findElement(By.xpath("//span[text()='Create Account']")).click();

}
}