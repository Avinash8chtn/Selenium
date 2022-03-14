import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mutiple_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
	    WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year")); 
		
		Select s = new Select(month);
		
		s.selectByIndex(10);
		
		System.out.println(s.isMultiple());
		
		List<WebElement> options = s.getOptions();
		System.out.println("total number of months : "+options.size());
		
//		int list = options.size();
//		System.out.println(" total number of days : " +list);
		
		System.out.println(" the months are : ");
		
		for (int i = 0; i<options.size(); i++)
		{
			String text = options.get(i).getText();
			
			System.out.println(text);
			
			if(text.equals("7"))
			{
				options.get(i).click();
				break;
			}
			
		}
		
		driver.quit();
		
		System.out.println(" success ");
	}
}
