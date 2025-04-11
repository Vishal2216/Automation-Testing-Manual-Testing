package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot 
{
public static void main(String[] args) throws IOException
	
	{
	//open the browser
	ChromeDriver driver = new ChromeDriver();
	//maximize the browser
	 driver.manage().window().maximize();																																																																																	
	//waiting condition
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into demowebshop
	 driver.get("https://demowebshop.tricentis.com/");
	 driver.navigate().to("https://www.redbus.in/");
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File from = ts.getScreenshotAs(OutputType.FILE);
	 File to = new File("D:\\selenium\\Selenium\\Dwspage.png");
	 FileHandler.copy(from, to);
	 
}
}