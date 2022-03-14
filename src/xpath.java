import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.xpath("//*[@name='txtUsername' or @type='text']"));
	    username.sendKeys("avinash8ch@gmail.com");
	
	}
}
