import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class table_demo extends base_class {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		getBrowser("chrome");
		
		getUrl("https://www.w3schools.com/html/html_tables.asp");
		
		// String before_xpath = "//*[@class='ws-table-all']/tbody/tr[2]/td[2]";
		
		 String before_xpath = "//*[@class='ws-table-all']/tbody/tr[";
		 
		 String after_xpath = "]/td[2]";
		 
		 for (int i = 2; i<=7; i++)
		 {
			 String actual_xpath = before_xpath + i + after_xpath;
			 
			WebElement element = driver.findElement(By.xpath(actual_xpath));
			
			System.out.println(element.getText());
		 }
		 
		success();
		
		closeBrowser();
		
		executionTime();
	}

	
}
