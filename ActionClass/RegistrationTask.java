package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTask 
{
	private static Select sele;

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_url="https://demo.automationtesting.in/Register.html";
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into demowebshop
		driver.get("https://demo.automationtesting.in/Register.html");
		String actual_url = driver.getCurrentUrl();
		if(expected_url.equals(actual_url))
		{
			System.out.println(" i am in Registration  page ....");
			driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Vishal");
			driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Patil");
			driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("At- Post- Bhose(k), Tal- Pandharpur, Dist-Solapur");
			driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("vishalpatil2720@gmail.com");
			driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("7721948543");
			driver.findElement(By.cssSelector("input[value='Male']")).click();	
			driver.findElement(By.cssSelector("input[value='Cricket']")).click();
			Thread.sleep(2000);
			
			Actions act = new Actions(driver);
			WebElement men = driver.findElement(By.id("msdd"));
			Thread.sleep(2000);
			act.moveToElement(men).click().perform();
			
			WebElement single_Select = driver.findElement(By.className("ui-corner-all"));
			Select sel = new Select(single_Select);
			sel.selectByVisibleText("English");
			
					
			
//			
			
//			WebElement single_Select = driver.findElement(By.id("Skills"));
//			Select sel = new Select(single_Select);
//			sel.selectByVisibleText("C");

			
			driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("7721948543");
		}
		else
		{
			System.out.println("i am not in Registration page page...");
			
		}
		Thread.sleep(2000);

	}
}


