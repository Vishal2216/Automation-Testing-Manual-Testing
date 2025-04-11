package PopUp;

	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AvoidNotifiction
	{

		
		
		public static void main(String[] args) throws InterruptedException, AWTException {
			
			
			ChromeOptions options =new ChromeOptions();
			options.addArguments("disable-notifications");
			WebDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.easemytrip.com/");
			Thread.sleep(2000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
		}
		

	}


