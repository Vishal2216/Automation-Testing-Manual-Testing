package JavaScriptExecutorMethods;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class ScroolByAxis
{
public static void main(String[] args) throws InterruptedException 
	
	{
	//open the browser
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://omayo.blogspot.com/");
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 //js.executeScript("window.scrollBy(0,1500)");
	 
	 js.executeScript("window.scrollTO(0,500)");
	 Thread.sleep(2000);
	 js.executeScript("window.scrollTO(0,-500)");
	 Thread.sleep(2000);
	 js.executeScript("window.scrollTO(0,500)");
	 Thread.sleep(2000);
	 js.executeScript("window.scrollTO(0,-500)");
	 Thread.sleep(2000);
}
}