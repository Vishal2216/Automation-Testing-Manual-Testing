package PopUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EcommerceClick 
{
	private static Object expected_url;

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		 driver.manage().window().maximize();																																																																																	
		//waiting condition
		Thread.sleep(2000);
		//enter into demowebshop
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		List<WebElement> ecommerce = driver.findElements(By.xpath(null));
		for(WebElement web : ecommerce)
		{
			web.click();
			String acrual_url = driver.getCurrentUrl();
			Object actual_url = null;
			if(expected_url.equals(actual_url))
			{
				driver.navigate().back();
			}
			Thread.sleep(2000);
}
}}