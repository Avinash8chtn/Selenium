import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo extends Execution_Time{
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		a.accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //button[text()='Confirm Box']")).click();
		
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(3000);
		a1.dismiss();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //button[text()='Prompt Box']")).click();
		
		Alert prompt = driver.switchTo().alert();
		Thread.sleep(3000);
		prompt.sendKeys("Iron Man");
		prompt.accept();
		
		
		
		
		
		
		System.out.println(" success ");
		
		// driver.quit();
		
		
	}

}
