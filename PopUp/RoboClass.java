package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboClass {

	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		
		Robot r= new Robot();
		
		
		driver.findElement(By.id("small-searchterms")).click();
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_Y);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_Y);
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_S);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_Y);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_Y);
		Thread.sleep(1000);
		
		
		
		
		
	}
}

//1open browser
//maximixze
//entter 
//handle the notification popup
//close


//write a script for agoda application
//max
//enter url
//handle notification popup
//close the browser


