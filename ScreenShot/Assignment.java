package ScreenShot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Assignment 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter into demoworkshop
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		driver.findElement(By.id("Email")).sendKeys("vishalpatil@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vishal@1");
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File from = ts.getScreenshotAs(OutputType.FILE);
		 File to = new File("D:\\selenium\\Selenium\\LoginPage.png");
		 FileHandler.copy(from, to);
		//close the browser
		//driver.close();
	}
	}

