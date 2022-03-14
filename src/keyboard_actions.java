
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class keyboard_actions {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	    driver.get("https://www.google.com/");
	    
	     driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("selenium" +Keys.ENTER);
	    
	    Actions a = new Actions(driver);
	    
	  //   a.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
	    
	    a.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
	    
	    
	     
	     System.out.println(" success ");
	 
		
		
	}

}
