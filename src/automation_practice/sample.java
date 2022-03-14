package automation_practice;

import org.openqa.selenium.By;

public class sample extends base_class{
	
	public static void main(String[] args) throws Exception {
		
		getBrowser("chrome");
		
		getUrl("http://automationpractice.com/index.php");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='']/a[text()='Dresses']")).click();
		
		
		
		
		
	}

}
