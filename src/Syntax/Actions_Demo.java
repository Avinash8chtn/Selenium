package Syntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://mrbool.com/");
	    
	    Actions  a = new Actions (driver);
	    
	    a.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Courses']")).click();
	    
	    driver.quit();
		
	    
	    System.out.println("success");
	}
	
}
