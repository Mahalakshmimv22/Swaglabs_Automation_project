package Automation_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Filter_Functionality {
	
WebDriver driver;
	
	@BeforeMethod
		
		public void testcase1 () throws InterruptedException{
				
				System.setProperty(
			            "webdriver.chrome.driver",
						 "C:\\Users\\Maha\\chromedriver-win64(1)\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
					
					driver.get("https://www.saucedemo.com/");
					
		            driver.manage().window().maximize();
					
					Thread.sleep(2000);
				
				System.out.println("Application launch successfull");
				
				WebElement username = driver.findElement(By.id("user-name"));
				username.sendKeys("standard_user");
				
				Thread.sleep(2000);
				
				WebElement password = driver.findElement(By.id("password"));
						
			    password.sendKeys("secret_sauce");
				
				Thread.sleep(2000);
				
				WebElement submit = driver.findElement(By.name("login-button"));
				
				submit.click();
			}
	
	@Test
	public void testcase2 () {
		WebElement filter = driver.findElement(By.xpath(" //select[@class='product_sort_container']"));
		filter.click();	
	}
	
	@Test
	public void testcase3 () throws InterruptedException {
		Select filter = new Select(driver.findElement(By.className("product_sort_container")));
		Thread.sleep(2000);
		filter.selectByValue("az");
		Thread.sleep(2000);	
	}
	@Test
	public void testcase4 () throws InterruptedException {
		Select filter = new Select(driver.findElement(By.className("product_sort_container")));
		Thread.sleep(2000);
		filter.selectByValue("za");
		Thread.sleep(2000);	
	}
	@Test
	public void testcase5 () throws InterruptedException {
		Select filter = new Select(driver.findElement(By.className("product_sort_container")));
		Thread.sleep(2000);
		filter.selectByValue("lohi");
		Thread.sleep(2000);		
	}
	@Test
	public void testcase6 () throws InterruptedException {
		Select filter = new Select(driver.findElement(By.className("product_sort_container")));
		Thread.sleep(2000);
		filter.selectByValue("hilo");
		Thread.sleep(2000);	
	}
	@AfterMethod
	public void testcase7 () {
		driver.quit();	
	}

}
