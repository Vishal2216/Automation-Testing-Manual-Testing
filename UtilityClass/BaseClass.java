package UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public static ChromeDriver driver = null;
	public static void preCondition() throws InterruptedException 
	{
	
		//open the browser
		driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into demo webshop
		driver.get("https://demowebshop.tricentis.com/");
}
	public static void login() throws InterruptedException
	{
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("vishal123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Vishal123");
		Thread.sleep(2000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value ='Log in']")).click();
	
		
	}
	public static void logout()
	{
		driver.findElement(By.className("ico-logout")).click();
	}
	public static void postCondition()
	{
		driver.close();
	}
}