import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handling_demo {
	
	@SuppressWarnings("unused")
	public static void executionTime()
	{
		long startTime = System.currentTimeMillis();

	    long total = 0;
	    for (int i = 0; i < 10000000; i++) {
	       total += i;
	    }

	    long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("the execution time is : "+elapsedTime+ " secs ");
	}
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		System.out.println(" the title is : " +driver.getTitle());
		
		// driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> l = new ArrayList<String>(handles);
		
		String parentWindowId = l.get(0);
		String childWindowId = l.get(1);
		
		System.out.println(parentWindowId);
		System.out.println(childWindowId);
		
		
		System.out.println(" after switching : " +driver.getTitle());
		
		
		System.out.println(" the title is : " +driver.getTitle());
		
		driver.get("https://www.google.com/");
		System.out.println(" the title is : " +driver.getTitle()); 
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		driver.quit();
		
		executionTime();
		
		System.out.println(" success ");
		
						
		
	}

}
