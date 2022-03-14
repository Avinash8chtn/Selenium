package automation_practice;

import org.openqa.selenium.By;

public class clear_method extends base_class{

	public static void main(String[] args) throws Exception {
		
		getBrowser("chrome");
		
		getUrl("http://automationpractice.com/index.php?id_product=4&controller=product");
		
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input.text")).clear();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input.text")).sendKeys("23");
		
		closeBrowser();
		
		success();
		
		executionTime();
		
		
		
	    
	}
}
