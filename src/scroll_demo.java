import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_demo extends Execution_Time {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		openBrowser();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		
		driver.get("https://www.thehindu.com/");
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		j.executeScript("window.scroll(0,450)", "");
		Thread.sleep(3000);
		j.executeScript("window.scroll(0,-450)", "");
		
		driver.quit();
		
		executionTime();

		System.out.println(" success ");
			
	}

	
	
}
