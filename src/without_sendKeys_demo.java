import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class without_sendKeys_demo extends base_class {

	public static void main(String[] args) throws Exception {
		
		getBrowser("chrome");
		
		getUrl("https://www.youtube.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('search').value='DJ TILLU'");
	    
//WebDriverWait w = new WebDriverWait(driver,5);
//		
//		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("input#search")));
	    
	    WebElement input = driver.findElement(By.id("search"));
	    
	    String attribute = input.getAttribute("value");
	    
	    System.out.println(" the entered value is : "+attribute);
	   
	    
	    
	   // closeBrowser();
	    
	    success();
	    
	    executionTime();
	}
}
