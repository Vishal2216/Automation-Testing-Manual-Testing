

package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

     public class HandleSwitch {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com");
		
		//for getting parent window handle
		String parent_handle = driver.getWindowHandle();
		System.out.println( parent_handle);
		Actions act=new Actions(driver);
	    Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		 child.remove(parent_handle);
		for(String str: child)
		{
			driver.switchTo().window(str);
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		
	}

}                                                                                                                                   
                                                                                                                                                   
   