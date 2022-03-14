import org.openqa.selenium.WebDriver;

public class Execution_Time {
	
	public static WebDriver driver;
	
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
	
	
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\avinash\\Selenium\\Driver\\chromedriver_97.exe");
	}

}
