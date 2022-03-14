package keyboard_demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class without_using_click extends base_class {

	public static void main(String[] args) throws Exception {
		
		getBrowser("msedge");
		
		getUrl("https://www.youtube.com/");
		
		
		driver.findElement(By.cssSelector("input#search")).sendKeys("DJ TILLU");
		
		Thread.sleep(10000);
		 driver.findElement(By.cssSelector("button#search-icon-legacy"));
		
		Thread.sleep(10000);
		Robot r = new Robot();
		
		Thread.sleep(10000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		screenShot();
	   
		closeBrowser();
		
		success();
		
		executionTime();
		
	}
}
