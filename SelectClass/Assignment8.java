package SelectClass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment8 
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	//maximize the browser
	 driver.manage().window().maximize();																																																																																	
	//waiting condition
	Thread.sleep(2000);
	//enter into demowebshop
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
	WebElement sort_by = driver.findElement(By.id("product-orderby"));
	Select sel = new Select(sort_by);
	List<WebElement> options = sel.getOptions();
	int i=0;
	for(WebElement web : options)
	{
		sort_by = driver.findElement(By.id("product-orderby"));
		sel=new Select(sort_by);
		sel.selectByIndex(i++);
		Thread.sleep(2000);
	}
}
}
