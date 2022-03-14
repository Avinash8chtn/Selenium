import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop extends base_class {

	public static void main(String[] args) throws Exception {
		
		getBrowser("msedge");
		
		getUrl("http://leafground.com/pages/drop.html");
		
		
		//driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		
//		Thread.sleep(5000);
//		a.dragAndDrop(source, destination).build().perform();
		
//		Thread.sleep(5000);
//		a.clickAndHold(source).moveToElement(destination).release().build().perform();
		
		a.doubleClick(source).build().perform();
		
		
		closeBrowser();
		
		success();
		
		executionTime();
		
		
		
	}
}
