package JavaScriptExecutorMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickDisableElement
{
public static void main(String[] args) throws InterruptedException 
	{
	//open the browser
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://www.oracle.com/in/java/technologies/downloads/#java17-windows");
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 WebElement Lock_jdk = driver.findElement(By.xpath("jdk-17.0.14_windows-x64_bin.msi"));
	 js.executeScript("arguments[0].scrollIntoView(false);",Lock_jdk);
	 Thread.sleep(2000);
	 Lock_jdk.click();
	 
	 WebElement disable_Element = driver.findElement(By.linkText("Download jdk-17.0.14_windows-x64_bin.msi"));
	 Thread.sleep(2000);
	 js.executeScript("arguments[0].click();",disable_Element); 
}
}