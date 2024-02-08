package Automation_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Menubar_Functionality {
	
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
		
		WebElement menubar = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menubar.click();
		
	}
@Test
	
	public void testcase3 () throws InterruptedException {
	
	WebElement menubar = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	menubar.click();
	
	Thread.sleep(2000);
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_sidebar_link")));
	driver.findElement(By.id("about_sidebar_link")).click();
	Thread.sleep(2000);
		
	}
@Test

public void testcase4 () throws InterruptedException {
	
	WebElement menubar = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	menubar.click();
	
	Thread.sleep(2000);
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
	driver.findElement(By.id("logout_sidebar_link")).click();
	Thread.sleep(2000);
	
}
@AfterMethod

public void testcase5 () {
	
	driver.quit();
	
}

}
