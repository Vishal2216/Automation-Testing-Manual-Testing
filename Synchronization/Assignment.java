package Synchronization;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment 
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
	 driver.get("https://omayo.blogspot.com/");
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
	 driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	 driver.navigate().back();
	 WebElement timer_button = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
	 timer_button.click();
	 Alert alt = driver.switchTo().alert();
	 System.out.println(alt.getText());
	 alt.accept();
	 driver.close();
	 
}
}