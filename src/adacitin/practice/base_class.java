package adacitin.practice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class base_class {
	
	public static WebDriver driver;
	
	   
	public static WebDriver getBrowser(String value) throws Exception
   {
 	 try {
		
		if(value.equalsIgnoreCase("chrome"))
 	  {
 		  System.setProperty("webdriver.chrome.driver",
 					"E:\\avinash\\Cucumber_Project\\Driver\\chromedriver_99.exe");
 			
 			driver = new ChromeDriver();
 	  } else if (value.equalsIgnoreCase("msedge")){
 		  
 		  System.setProperty("webdriver.edge.driver", 
 				  "E:\\avinash\\Selenium\\Driver\\msedgedriver.exe");
 		  
 		  driver = new EdgeDriver();
			
		} else if(value.equalsIgnoreCase("firefox"))
			
		{
			System.setProperty("webdriver.gecko.driver", 
					"E:\\avinash\\Selenium\\Driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		else
 	  {
 		 System.out.println(" Web driver not found !!!! ");
 	  }
 	 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
 	  driver.manage().window().maximize();
 	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 	  try {
 		 Thread.sleep(3000);
 	  }catch(Exception e)
 	  {
 		  e.printStackTrace();
 	  }
 	  
 	  
		return driver;
   }
	   
	   public static void getUrl(String value)
	   {
		   driver.get(value);
	   }
	   
	  
	   public static void inputValue(WebElement element, String value) throws InterruptedException
	   {
		   Thread.sleep(3000);
		   element.sendKeys(value);
	   }
	   
	   public static void clickOnElement(WebElement element) throws InterruptedException
	   {
		   Thread.sleep(3000);
		   element.click();
	   }
	   
	   public static void closeBrowser() throws InterruptedException
	   {
		   Thread.sleep(3000);
		   driver.quit();
	   }
	   
	   public static void success()
	   {
		   System.out.println( " Execution automated successfully !!! ");
	   }
	   
	   public static void executionTime()
		{
			long startTime = System.currentTimeMillis();

		   
			long total = 0;
		    for (int i = 0; i < 10000000; i++) {
		       total += i;
		    }

		    long stopTime = System.currentTimeMillis();
		    long elapsedTime = stopTime - startTime;
		    System.out.println("the execution time is : "+elapsedTime+ " secs ");
		}
	   
	   public static void screenShot() throws Exception
	   {
		   
		   TakesScreenshot ts = (TakesScreenshot) driver;
		   
		   File source = ts.getScreenshotAs(OutputType.FILE);
		   
		   File destination = new 
				   File("E:\\avinash\\Selenium\\youtube.png");
		   
		   Files.copy(source, destination);
		   
	 }
	   
	   public static void dropdown(WebElement element, String value) {
			Select s = new Select(element);

			
			 if (value.equals("value")) {

				s.selectByValue(value);

			}

			else if (value.equals("text")) {
				s.selectByVisibleText(value);
			}
			 
			
		}

}
