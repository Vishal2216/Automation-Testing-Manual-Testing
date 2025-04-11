package JavaScriptExecutorMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassValueWithoutClickHiddenElement 
{
public static void main(String[] args) throws InterruptedException 
	
	{
	
	//open the browser
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.linkText("Create new account")).click();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 WebElement gender = driver.findElement(By.id("custom_gender"));
	 js.executeScript("arguments[0].value='Transgender';",gender);
	 
	}
}
