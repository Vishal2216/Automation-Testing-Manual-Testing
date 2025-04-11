package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	
	public static void main(String[] args) throws InterruptedException{
		
		
		
	WebDriver driver=new  ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get( " https://demowebshop.tricentis.com/ ");
	
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Alert alt = driver.switchTo().alert();
	
	Thread.sleep(2000);
	
	alt.accept();
	
	   
		
	}

}
