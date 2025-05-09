package JavaScriptExecutorMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewBaseOnWebElement 
{
public static void main(String[] args) throws InterruptedException 
	
	{
	//open the browser
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://omayo.blogspot.com/");
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 WebElement dropdown = driver.findElement(By.xpath("//button[text()='Dropdown']"));
	 js.executeScript("arguments[0].scrollIntoView(false);",dropdown);
}
}