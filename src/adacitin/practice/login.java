package adacitin.practice;

import org.openqa.selenium.By;

public class login extends base_class{
	
	public static void main(String[] args) throws Exception {
		
		getBrowser("chrome");
		
		getUrl("https://adactinhotelapp.com/");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("avinash8");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("U9C4M1");
	}

}
