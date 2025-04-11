package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class AvoidNotification {
	
	
	public static void main(String[] args) {
		
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		
	}
	

}
