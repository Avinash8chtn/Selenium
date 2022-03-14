import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectors_demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.cssSelector("input[name=\"email\"]"));
		username.sendKeys("avinash8ch@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("password");
		
		
		driver.quit();
		
		System.out.println(" success ");
		
		
		
		
	}

}
