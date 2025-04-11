package PopUp;

	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;

	public class Assignment11  //QtalkBrowserWindow
	{
	 public static void main(String[] args) throws InterruptedException {
	  // TODO Auto-generated method stub

	  
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://demoapps.qspiders.com/");
	    Thread.sleep(2000);
	    String parent_handle = driver.getWindowHandle();
	    System.out.println(parent_handle);
	       driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	       Thread.sleep(2000);
	    driver.findElement(By.xpath("//ul[@class='pt-2 pe-1']/li[3]/section")).click();    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
	       Thread.sleep(2000);
	       
	       
	       driver.findElement(By.id("browserLink1")).click(); 
	       Thread.sleep(2000);
	    Set<String> child = driver.getWindowHandles();
	   System.out.println(child);
	   child.remove(parent_handle);
	   for (String str : child) {
	    driver.switchTo().window(str);
	   
	   Thread.sleep(2000);
	   
	       driver.findElement(By.id("email")).sendKeys("akshatmankar90@gmail.com");
	       Thread.sleep(2000);
	       driver.findElement(By.id("password")).sendKeys("123456789");
	       Thread.sleep(2000);
	       driver.findElement(By.id("confirm-password")).sendKeys("123456789");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	       Thread.sleep(2000);
	       driver.close();
	       driver.switchTo().window(parent_handle);
	       
	   }
	   
	   
	   //TAB
	   driver.findElement(By.xpath("//a[text()='New Tab']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("browserButton4")).click();
	        Thread.sleep(2000);
	        Set<String> child1 = driver.getWindowHandles();
	    System.out.println(child1);
	    child1.remove(parent_handle);
	    for (String str : child1) {
	     driver.switchTo().window(str);
	    
	    Thread.sleep(2000);
	    
	      driver.findElement(By.id("email")).sendKeys("akshatmankar90@gmail.com");
	      Thread.sleep(2000);
	      driver.findElement(By.id("password")).sendKeys("123456789");
	      Thread.sleep(2000);
	      driver.findElement(By.id("confirm-password")).sendKeys("123456789");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	      Thread.sleep(2000);
	      driver.close();
	      driver.switchTo().window(parent_handle);
	    }
	    
	    //multiplewindows
	    driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.id("browserButton3")).click();
	         Thread.sleep(2000);
	                 
	         String expected_url="https://demoapps.qspiders.com/ui/browser/SignUpPage";
	         String expected_url1="https://demoapps.qspiders.com/ui/browser/SignUp";
	         String expected_url2="https://demoapps.qspiders.com/ui/browser/Login";
	         
	         Set<String> childs = driver.getWindowHandles();
	         System.out.println(childs);
	     childs.remove(parent_handle);
	     for (String str : childs) {
	      driver.switchTo().window(str);
	      
	     
	      String actual_utl = driver.getCurrentUrl();
	      if(expected_url.equals(actual_utl)) {
	     
	      Thread.sleep(2000);
	      driver.findElement(By.id("email")).sendKeys("akshatmankar90@gmail.com");
	         Thread.sleep(2000);
	         driver.findElement(By.id("password")).sendKeys("123456789");
	         Thread.sleep(2000);
	         driver.findElement(By.id("confirm-password")).sendKeys("123456789");
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	         Thread.sleep(2000);
	        driver.close();

	      } 
	     }
	     Set<String> childs1 = driver.getWindowHandles();
	          System.out.println(childs1);
	      childs1.remove(parent_handle);
	      for (String str : childs1) {
	       driver.switchTo().window(str);
	       String actual_utl = driver.getCurrentUrl();
	       if(expected_url1.equals(actual_utl)) {
	       
	       driver.findElement(By.id("username")).sendKeys("Akshat");
	          Thread.sleep(2000);
	       driver.findElement(By.id("email")).sendKeys("akshatmankar90@gmail.com");
	          Thread.sleep(2000);
	          driver.findElement(By.id("password")).sendKeys("123456789");
	          Thread.sleep(2000);
	          
	          driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	          Thread.sleep(2000);
	          driver.close();
		
	       } 
	      }
	      
	       Set<String> childs11 = driver.getWindowHandles();
	           System.out.println(childs11);
	       childs11.remove(parent_handle);
	       for (String str : childs11) {
	        driver.switchTo().window(str);
	        String actual_utl = driver.getCurrentUrl();
	       if(expected_url2.equals(actual_utl)) {
	       
	       driver.findElement(By.id("username")).sendKeys("Akshat");
	          Thread.sleep(2000);
	          driver.findElement(By.id("password")).sendKeys("123456789");
	          Thread.sleep(2000);
	         
	          driver.findElement(By.xpath("//button[text()='Login']")).click();
	          Thread.sleep(2000);
	         driver.close();
	         driver.switchTo().window(parent_handle);

	       } 
	      }
	       
	//multipletabs
		
	        driver.findElement(By.xpath("//a[text()='Multiple Tabs']")).click();
	            Thread.sleep(2000);
	            driver.findElement(By.id("browserButton2")).click();
	            Thread.sleep(2000);
	            
	            
	            String expected_url3="https://demoapps.qspiders.com/ui/browser/SignUpPage";
	            String expected_url4="https://demoapps.qspiders.com/ui/browser/SignUp";
	            String expected_url5="https://demoapps.qspiders.com/ui/browser/Login";
	            
	            Set<String> childs111 = driver.getWindowHandles();
	            System.out.println(childs111);
	        childs111.remove(parent_handle);
	        for (String str : childs111) {
	         driver.switchTo().window(str);
	         
	        
	         String actual_utl = driver.getCurrentUrl();
	         if(expected_url3.equals(actual_utl)) {
	        
	         Thread.sleep(2000);
	         driver.findElement(By.id("email")).sendKeys("akshatmankar90@gmail.com");
	            Thread.sleep(2000);
	            driver.findElement(By.id("password")).sendKeys("123456789");
	            Thread.sleep(2000);
	            driver.findElement(By.id("confirm-password")).sendKeys("123456789");
	            Thread.sleep(2000);
	            driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	            Thread.sleep(2000);
	            driver.close();
	         } 
	        }
	        Set<String> childs4 = driver.getWindowHandles();
	             System.out.println(childs4);
	         childs4.remove(parent_handle);
	         for (String str : childs4) {
	          driver.switchTo().window(str);
	          String actual_utl = driver.getCurrentUrl();
	          if(expected_url4.equals(actual_utl)) {
	          
	          driver.findElement(By.id("username")).sendKeys("Akshat");
	             Thread.sleep(2000);
	          driver.findElement(By.id("email")).sendKeys("akshatmankar90@gmail.com");
	             Thread.sleep(2000);
	             driver.findElement(By.id("password")).sendKeys("123456789");
	             Thread.sleep(2000);
	             
	             driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	             Thread.sleep(2000);
	             driver.close();
	          } 
	         }
	         
	          Set<String> childs1111 = driver.getWindowHandles();
	              System.out.println(childs1111);
	          childs1111.remove(parent_handle);
	          for (String str : childs1111) {
	           driver.switchTo().window(str);
	           String actual_utl = driver.getCurrentUrl();
	          if(expected_url5.equals(actual_utl)) {
	          
	          driver.findElement(By.id("username")).sendKeys("Akshat");
	             Thread.sleep(2000);
	             driver.findElement(By.id("password")).sendKeys("123456789");
	             Thread.sleep(2000);
	            
	             driver.findElement(By.xpath("//button[text()='Login']")).click();
	             Thread.sleep(2000);
	             driver.close();
	             driver.switchTo().window(parent_handle);
	          }
	          Thread.sleep(2000);
	         driver.close();
	        }
	       
	 }
		
	
}
