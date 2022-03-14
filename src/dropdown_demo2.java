import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_demo2 {

	public static WebDriver driver;
	
	public static void selectDropdownValue(String xpathValue , String value)
	{
		List<WebElement> month_list = driver.findElements(By.xpath(xpathValue));
		System.out.println("number of months : "+month_list.size());
		
		for (int i =0 ; i<month_list.size(); i++)
		{
			System.out.println(month_list.get(i).getText());
			
			if(month_list.get(i).getText().equals("Jun"))
			{
			      month_list.get(i).click();
			      break; 
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		// WebElement month = driver.findElement(By.id("month"));
		
		String month_xpath = "//select[@id='month']//option";
		
		selectDropdownValue(month_xpath,"Jan");
		
		driver.quit();
		
	}

	
}
