package Automation_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Addtocart_functionality {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void launchtheapplication () throws InterruptedException{
			
			System.setProperty(
		            "webdriver.chrome.driver",
		            "C:\\Users\\Maha\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
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
			System.out.println("Application launch successfull");
			
						
		}
	@Test
		public void addtocart () throws InterruptedException {
			
			WebElement addtocart = driver.findElement(By.xpath(" //button[@id='add-to-cart-sauce-labs-backpack']"));
			addtocart.click();
			
			Thread.sleep(2000);
			
			System.out.println("product added to the cart successfully");
		}
	
		@Test
		public void testcase3 () throws InterruptedException {
			
			WebElement addtocart = driver.findElement(By.xpath(" //button[@id='add-to-cart-sauce-labs-backpack']"));
			addtocart.click();
			Thread.sleep(2000);
			
			WebElement carticon = driver.findElement(By.xpath(" //a[@class='shopping_cart_link']"));
			carticon.click();
			Thread.sleep(2000);
			
			WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
			checkout.click();
			Thread.sleep(2000);
			System.out.println("Application has checked out");
		}
		
		@Test
		public void testcase4 () throws InterruptedException {
			
			WebElement addtocart = driver.findElement(By.xpath(" //button[@id='add-to-cart-sauce-labs-backpack']"));
			addtocart.click();
			Thread.sleep(2000);
			
			WebElement carticon = driver.findElement(By.xpath(" //a[@class='shopping_cart_link']"));
			carticon.click();
			Thread.sleep(2000);
			
			WebElement conshop = driver.findElement(By.xpath(" //button[@id='continue-shopping']"));
			conshop.click();
			Thread.sleep(2000);
			System.out.println("Application has clicked on continue shopping");
				
		}
		
		@Test
		public void testcase5 () throws InterruptedException {
			
			
			WebElement addtocart = driver.findElement(By.xpath(" //button[@id='add-to-cart-sauce-labs-backpack']"));
			addtocart.click();
			
			Thread.sleep(2000);
			
			WebElement remove = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
			remove.click();
			
			Thread.sleep(2000);
			
			System.out.println("product removed  successfully");
				
		}
		
	@AfterMethod
		public void testcase6 () {
			
			driver.quit();
		}

}
