package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriRegistration 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		 driver.manage().window().maximize();																																																																																	
		//waiting condition
		Thread.sleep(2000);
		//enter into demowebshop
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//input[@type='text'] [1]")).sendKeys("Vishal");
		driver.findElement(By.xpath("//input[@id='email'] ")).sendKeys("vishalpatil2720@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vishal@123");
		driver.findElement(By.xpath("//input[@id='mobile'] ")).sendKeys("7721948543");
		driver.findElement(By.className("main-3")).click();
		WebElement selectFile = driver.findElement(By.xpath("//button[@type='button'] [1]"));
		selectFile.click();
		selectFile.sendKeys("C:\\Users\\Vishal\\Documents\\RESUME.DOC");
}
}
