import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot_demo extends base_class{
	
	public static void main(String[] args) throws Exception {
		
		getBrowser("chrome");
		
		getUrl("https://www.youtube.com/");
		
		screenShot();
		
		closeBrowser();
		
		success();
		
		executionTime();
	}

	
}
