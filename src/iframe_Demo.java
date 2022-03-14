import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_Demo extends Execution_Time {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
		
		@SuppressWarnings("unused")
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button#Click")).click();
		
		String text = driver.findElement(By.cssSelector("button#Click")).getText();
		System.out.println(" text displayed after i gave click : "+text);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("button#Click1")).click();
		
		String text2 = driver.findElement(By.cssSelector("button#Click1")).getText();
		System.out.println(" text displayed after i gave click : "+text2);
		
		driver.switchTo().defaultContent();
		
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		int size = frame.size();
		System.out.println("the total number of frames : "+size);
		
		driver.quit();
		
		executionTime();
		
		
		
		
		
		
	}

}
