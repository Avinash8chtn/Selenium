package adacitin.practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class search_page extends base_class {

	public static void main(String[] args) throws Exception {
		
		
		getBrowser("chrome");
		
		 getUrl("https://adactinhotelapp.com/BookHotel.php");
		
		// driver.navigate().to("https://adactinhotelapp.com/SelectHotel.php");
		
		 
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("avinash8");
			
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("U9C4M1");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#login")).click();
		
		Thread.sleep(2000);
	    WebElement location = driver.findElement(By.cssSelector("select#location"));
	    
	    Select s = new Select(location);
	    
	    s.selectByValue("Melbourne");
	    
	    Thread.sleep(2000);
	    WebElement hotels = driver.findElement(By.cssSelector("select#hotels"));
	    
	    Select s1 = new Select(hotels);
	    
	    s1.selectByValue("Hotel Hervey");
	    
	    Thread.sleep(2000);
	    WebElement room_type = driver.findElement(By.cssSelector("select#room_type"));
	    
	    Select s2 = new Select(room_type);
	    
	    s2.selectByValue("Double");
	    
	    Thread.sleep(2000);
	    WebElement room_nos = driver.findElement(By.cssSelector("select#room_nos"));
	    
	    Select s3 = new Select(room_nos);
	    
	    s3.selectByValue("3");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input#datepick_in")).sendKeys("03/08/2022");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input#datepick_out")).sendKeys("03/09/2022");
	    
	    Thread.sleep(2000);
	    WebElement adults = driver.findElement(By.cssSelector("select#adult_room"));
	    
	    Select s4 = new Select (adults);
	    
	    s4.selectByValue("4");
	    
	    Thread.sleep(2000);
        WebElement child = driver.findElement(By.cssSelector("select#child_room"));
	    
	    Select s5 = new Select (adults);
	    
	    s5.selectByValue("4");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input#Submit")).click();
	   
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input#radiobutton_0")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input#continue")).click();
	    
	    // closeBrowser();
	    
	    success();
	    
	    executionTime();
		
	}
}
