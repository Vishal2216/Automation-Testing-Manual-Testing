package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class WebElementsScreenshot 
{
public static void main(String[] args) throws IOException
	
	{
	LocalDateTime date = LocalDateTime.now();
	String name = date.toString().replace(':', '-');
	//System.out.println(date);
	System.out.println(name);
	//open the browser
	org.openqa.selenium.WebDriver driver = new ChromeDriver();
	//maximize the browser
	 driver.manage().window().maximize();																																																																																	
	//waiting condition
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into demowebshop
	 driver.get("https://demowebshop.tricentis.com/");
	 WebElement dws_icon = driver.findElement(By.className("header-logo"));
	 File from = dws_icon.getScreenshotAs(OutputType.FILE);
	 File to = new File("D:\\selenium\\Selenium\\icon"+name+".png");
	 FileHandler.copy(from, to);
	 
}

}
