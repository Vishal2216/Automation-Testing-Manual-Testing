package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_upWindowAssigmentNewTab {

	public static void main(String[] args) throws InterruptedException {
		String expected_url="https://demoapps.qspiders.com/ui";
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demoapps.qspiders.com/");
		
		String new_Tab = driver.getWindowHandle();
		System.out.println(new_Tab);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		String actual_url=driver.getCurrentUrl();
		Thread.sleep(2000);
		if (expected_url.equals(actual_url)) {
			driver.findElement(By.xpath("//section[text()='Popups']")).click();
			System.out.println("Iam in UI page");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='New Tab']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Open window in new Tab']")).click();
			Thread.sleep(2000);
			
			Set<String> newTab = driver.getWindowHandles();
			System.out.println(newTab);
			newTab.remove(new_Tab);
			for (String str : newTab) {
				driver.switchTo().window(str);
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ranjeet1920@gmail.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123455");
				driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("123455");
			}
		}
		else {
			System.out.println("Iam not in UI page");
		}
		driver.quit();
	}
}
