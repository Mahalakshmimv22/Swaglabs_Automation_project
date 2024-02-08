package Automation_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Functionality {
	
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
	
	}
	
	@Test
	
 public void testcase2 () throws InterruptedException{
		
			WebElement username = driver.findElement(By.id("user-name"));
			username.sendKeys("standard_user");
			
			Thread.sleep(2000);
			
			WebElement password = driver.findElement(By.id("password"));
					
		    password.sendKeys("secret_sauce");
			
			Thread.sleep(2000);
			
			WebElement submit = driver.findElement(By.name("login-button"));
			
			submit.click();
			
			driver.close();
			
		
		System.out.println("Login functionality with valid username and valid password is successfull");
	}
	@Test
	public void testcase3 () throws InterruptedException {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
				
	    password.sendKeys("secret_sauc");
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.name("login-button"));
		
		submit.click();
		
		System.out.println("Login functionality with valid username and Invalid password is successfull");		
	}
	@Test	
	public void testcase4 () throws InterruptedException {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_use");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
				
	    password.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.name("login-button"));
		
		submit.click();
		
		System.out.println("Login functionality with Invalid username and valid password is successfull");
	}
	
	@Test
	
	public void testcase5 () throws InterruptedException {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_use");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
				
	    password.sendKeys("secret_sauc");
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.name("login-button"));
		
		submit.click();
		
		System.out.println("Login functionality with Invalid username and Invalid password is successfull");	
	}
	@Test
	
	public void testcase6 () throws InterruptedException {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
				
	    password.sendKeys("");
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.name("login-button"));
		
		submit.click();
		
		System.out.println("Login functionality with Empty field of username and password is successfull");
			
	}
	@AfterMethod
	public void testcase7 () {
		
		driver.quit();
	}

}
