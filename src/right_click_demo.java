import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click_demo {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
	
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions a = new Actions(driver);
		
		a.contextClick(rightclick).build().perform();
		
		WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		
		String Text = copy.getText();
		System.out.println(Text);
		
		copy.click();
		
		driver.quit();
		
		System.out.println(" success ");
		
		
		
		
		
		
		
		
		}
}
