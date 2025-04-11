package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoSite
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

		driver.switchTo().frame("0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class ='col-xs-6 col-xs-offset-5']/input")).sendKeys("Vishal");
		
}
}
