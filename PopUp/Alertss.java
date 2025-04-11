package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertss {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		
		
		
		driver.findElement(By.cssSelector(".btn.btn-info")).click();
		
		   Alert act = driver.switchTo().alert();
		   
		   act.sendKeys("hello how are you");
		   Thread.sleep(2000);
		   
		   
		 System.out.println(act.getText()); 
		   
		   act.accept();
		   
		
	}

}






//