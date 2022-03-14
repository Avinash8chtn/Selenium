import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class checkbox_demo extends base_class{

	public static void main(String[] args) throws Exception {
		
		getBrowser("firefox");
		
		getUrl("http://www.leafground.com/pages/checkbox.html");
		
		Thread.sleep(5000);
	 driver.findElement(By.xpath("//div[@class='example'][2]//div//input[@type='checkbox']"));
	//	check_box.click();
		
//		if(check_box.isSelected())
//		{
//			System.out.println("check box selected !!! ");
//		}
//		
//		else
//		{
//			System.out.println(" check box not selected");
//		}
//		
//		closeBrowser();
	
	
	}
}
