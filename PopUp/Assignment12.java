package PopUp;
	import java.awt.AWTException;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class Assignment12 {

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			String expected_url="https://demoapps.qspiders.com/ui";
			WebDriver multidriver=new ChromeDriver();
			
			multidriver.manage().window().maximize();
			Thread.sleep(2000);
			
			multidriver.get("https://demoapps.qspiders.com/");
			
			String ui_page = multidriver.getWindowHandle();
			System.out.println(ui_page);
			Thread.sleep(2000);
			multidriver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
			
			String actual_url=multidriver.getCurrentUrl();
			Thread.sleep(2000);
			if (expected_url.equals(actual_url)) {
				multidriver.findElement(By.xpath("//section[text()='Popups']")).click();
				System.out.println("Iam in UI page");
				Thread.sleep(2000);
				multidriver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
				Thread.sleep(2000);
				multidriver.findElement(By.xpath("//a[@id='browserLink1']")).click();
				
				Set<String> new_Window = multidriver.getWindowHandles();
				System.out.println(new_Window);
				new_Window.remove(ui_page);
				for (String str: new_Window) {
					multidriver.switchTo().window(str);
					
					Thread.sleep(2000);
					multidriver.findElement(By.xpath("//input[@id='email']")).sendKeys("shashi09@gmail.com");
					multidriver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234567");
					multidriver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("1234567");
				}
			}
			else {
				System.out.println("Iam not in UI page");
			}
			//multidriver.close();
			multidriver.quit();
		}
		
	}


