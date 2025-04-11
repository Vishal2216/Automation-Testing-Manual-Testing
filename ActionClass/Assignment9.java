package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment9
{
	public static void main(String[] args) throws InterruptedException 
	{
		String expected_url="https://demowebshop.tricentis.com/";
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url = driver.getCurrentUrl();
		if(expected_url.equals(actual_url))
		{
			System.out.println(" i am in dws page ....");
			Actions actions = new Actions(driver);
			 actions.moveToElement(driver.findElement(By.cssSelector("a[href='/register']"))).click().perform();

	            // Select "Male" gender using Actions class
	            actions.moveToElement(driver.findElement(By.cssSelector("input[id='gender-male']"))).click().perform();

	            // Enter "First Name" using Actions class
	            actions.moveToElement(driver.findElement(By.cssSelector("input[id='FirstName']"))).click().sendKeys("Vishal").perform();
	                   

	            // Enter "Last Name" using Actions class
	            actions.moveToElement(driver.findElement(By.cssSelector("input[id='LastName']"))).click().sendKeys("Patil").perform();

	                  
	            // Enter "Email" using Actions class
	            actions.moveToElement(driver.findElement(By.cssSelector("input[id='Email']"))).click().sendKeys("vishalpatil2720@gmail.com").perform();

	            // Enter "Password" using Actions class
	            actions.moveToElement(driver.findElement(By.cssSelector("input[id='Password']"))).click().sendKeys("Vishal@123").perform();

	            // Enter "Confirm Password" using Actions class
	            actions.moveToElement(driver.findElement(By.cssSelector("input[id='ConfirmPassword']"))).click().sendKeys("Vishal@123").perform();

	            // Click on the "Register" button using Actions class
	            actions.moveToElement(driver.findElement(By.cssSelector("input[id='register-button']"))).click().perform();

	            System.out.println("Registration process completed.");
			
			
		}
		else
		{
			System.out.println("i am not in dws page...");
			
		}
		Thread.sleep(2000);
		driver.close();
	}
}
