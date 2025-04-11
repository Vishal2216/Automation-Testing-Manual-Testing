package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPop
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		 driver.manage().window().maximize();																																																																																	
		//waiting condition
		Thread.sleep(2000);
		//enter into demowebshop
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(2000);
		WebElement selectFile = driver.findElement(By.xpath("//input[@type='file']"));
		
		selectFile.sendKeys("C:\\Users\\Vishal\\Documents\\RESUME.docx");
				}
}