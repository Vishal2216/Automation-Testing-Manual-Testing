package DateAndTime;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LocateDateTime 
{
public static void main(String[] args) throws IOException
	
	{
	LocalDateTime date = LocalDateTime.now();
	String name = date.toString().replace(':', '-');
	//System.out.println(date);
	System.out.println(name);
	ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://demowebshop.tricentis.com/");
	 driver.navigate().to("https://www.redbus.in/");
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File from = ts.getScreenshotAs(OutputType.FILE);
	 File to = new File("D:\\selenium\\Selenium\\Dwspage.png");
	 FileHandler.copy(from, to);
	 
}
}
