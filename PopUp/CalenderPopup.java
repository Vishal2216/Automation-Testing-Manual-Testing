package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopup 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("dvfarecal")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("10/01/2025")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("rdatelbl")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("snd_2_06/05/2025")).click();
		
}
}