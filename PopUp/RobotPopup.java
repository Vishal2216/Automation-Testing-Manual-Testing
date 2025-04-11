package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//notificationHandle
//we use robot Popup

public class RobotPopup {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
     WebDriver driver= new ChromeDriver();
     
     driver.get("https://www.easemytrip.com/");
     
     driver.manage().window().maximize();
     Thread.sleep(2000);
     Robot r= new Robot();
     r.keyPress(KeyEvent.VK_TAB);
     Thread.sleep(1000);
     r.keyPress(KeyEvent.VK_TAB);
     Thread.sleep(1000);
     r.keyPress(KeyEvent.VK_TAB);
     Thread.sleep(1000);
     r.keyPress(KeyEvent.VK_TAB);
     Thread.sleep(1000);
     
     r.keyRelease(KeyEvent.VK_TAB);
     Thread.sleep(1000);
     r.keyRelease(KeyEvent.VK_TAB);
     Thread.sleep(1000);
     r.keyRelease(KeyEvent.VK_TAB);
     Thread.sleep(1000);
     r.keyRelease(KeyEvent.VK_TAB);
     Thread.sleep(1000);
     
     
     
     
   
     
		
	}
	

}
