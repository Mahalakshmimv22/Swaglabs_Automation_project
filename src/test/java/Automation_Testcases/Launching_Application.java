package Automation_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launching_Application {
	
@Test
	
	public void testcase1 () throws InterruptedException{
		
		System.setProperty(
	            "webdriver.chrome.driver",
				"C:\\Users\\Maha\\chromedriver-win64(1)\\chromedriver-win64\\chromedriver.exe");
	            
		
		WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			
            driver.manage().window().maximize();
			
			Thread.sleep(2000);
		
		System.out.println("Application launch successfull");
	}

}
