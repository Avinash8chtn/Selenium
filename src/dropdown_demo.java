import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown_demo {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
	    WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String dob = "23-Mar-2012";
		
		String[] dobarr = dob.split("-");
		
		
		
		
		selectOptions(day,dobarr[0]);
		selectOptions(month,dobarr[1]);
		selectOptions(year,dobarr[2]);
		
		// driver.quit();
		
		System.out.println(" success ");
		
//		Select s = new Select(day);
//		s.selectByVisibleText("10");
//		
//		Select s1 = new Select(month);
//		s1.selectByVisibleText("Jul");
//		
//		Select s2 = new Select(year);
//		s2.selectByVisibleText("2012");
		
		}
	
	public static void selectOptions(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

}
