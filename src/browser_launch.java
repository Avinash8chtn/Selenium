import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class browser_launch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
//		Thread.sleep(3000);
//		driver.close();
		
		
		String title = driver.getTitle();
		System.out.println(" the title is  : "+title);
		
		driver.quit();
		
		
	    System.out.println(" success ");
		
	}

}
