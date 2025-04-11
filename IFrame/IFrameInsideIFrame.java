package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameInsideIFrame  //Nested Iframe
{
	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into demoworkshop
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		Thread.sleep(2000);
		WebElement outer_parent = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		driver.switchTo().frame(outer_parent);
		Thread.sleep(2000);
		WebElement inner_parent = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
		driver.switchTo().frame(inner_parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vishal");
}
}