package Automation_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkout_Functionality {
	
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

	       public void testcase2 () throws InterruptedException {
	    	  WebElement addtocart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
				addtocart.click();
				Thread.sleep(2000);
				
				WebElement carticon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
				carticon.click();
				Thread.sleep(2000);
				
				WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
				checkout.click();
				Thread.sleep(2000);
				
				WebElement firstname = driver.findElement(By.id("first-name"));
				firstname.sendKeys("Maha");
				
				WebElement lastname = driver.findElement(By.id("last-name"));
				lastname.sendKeys("Lakshmi");
				Thread.sleep(2000);
				
				WebElement zipcode = driver.findElement(By.id("postal-code"));
				zipcode.sendKeys("560021");
				Thread.sleep(2000);
				
				WebElement conshop = driver.findElement(By.xpath("//input[@id='continue']"));
				conshop.click();
				Thread.sleep(2000);
	    	   
	       }
	      
	      @Test

	      public void testcase3 () throws InterruptedException {
	    	  
	    	  WebElement addtocart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
				addtocart.click();
				Thread.sleep(2000);
				
				WebElement carticon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
				carticon.click();
				Thread.sleep(2000);
				
				WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
				checkout.click();
				Thread.sleep(2000);
	   	   
	   	   
	      }
	      @Test

	      public void testcase4 () throws InterruptedException {
	    	  WebElement addtocart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
				addtocart.click();
				Thread.sleep(2000);
				
				WebElement carticon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
				carticon.click();
				Thread.sleep(2000);
				
				WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
				checkout.click();
				Thread.sleep(2000);
				
				WebElement firstname = driver.findElement(By.id("first-name"));
				firstname.sendKeys("Maha");
				
				WebElement lastname = driver.findElement(By.id("last-name"));
				lastname.sendKeys("Lakshmi");
				Thread.sleep(2000);
				
				WebElement zipcode = driver.findElement(By.id("postal-code"));
				zipcode.sendKeys("560021");
				Thread.sleep(2000);
				
				WebElement con = driver.findElement(By.xpath("//input[@id='continue']"));
				con.click();
				Thread.sleep(2000);
				
				WebElement cancel = driver.findElement(By.xpath("//button[@id='cancel']"));
	          cancel.click();
				Thread.sleep(2000);
	   	   
	   	   
	      }
	      
	      @Test

	      public void testcase5 () throws InterruptedException {
	    	  WebElement addtocart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
				addtocart.click();
				Thread.sleep(2000);
				
				WebElement carticon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
				carticon.click();
				Thread.sleep(2000);
				
				WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
				checkout.click();
				Thread.sleep(2000);
				
				WebElement firstname = driver.findElement(By.id("first-name"));
				firstname.sendKeys("Maha");
				
				WebElement lastname = driver.findElement(By.id("last-name"));
				lastname.sendKeys("Lakshmi");
				Thread.sleep(2000);
				
				WebElement zipcode = driver.findElement(By.id("postal-code"));
				zipcode.sendKeys("560021");
				Thread.sleep(2000);
			
				
				WebElement cancel = driver.findElement(By.xpath("//button[@id='cancel']"));
				cancel.click();
				Thread.sleep(2000);
	   	   
	   	   
	      }
	      
	      @Test

	      public void testcase6 () throws InterruptedException {
	    	  WebElement addtocart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
				addtocart.click();
				Thread.sleep(2000);
				
				WebElement carticon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
				carticon.click();
				Thread.sleep(2000);
				
				WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
				checkout.click();
				Thread.sleep(2000);
				
				WebElement firstname = driver.findElement(By.id("first-name"));
				firstname.sendKeys("Maha");
				
				WebElement lastname = driver.findElement(By.id("last-name"));
				lastname.sendKeys("Lakshmi");
				Thread.sleep(2000);
				
				WebElement zipcode = driver.findElement(By.id("postal-code"));
				zipcode.sendKeys("560021");
				Thread.sleep(2000);
				
				WebElement con = driver.findElement(By.xpath("//input[@id='continue']"));
				con.click();
				Thread.sleep(2000);
				
				WebElement finish = driver.findElement(By.xpath("//button[@id='finish']"));
				finish.click();
				Thread.sleep(2000);
				 
	      }
	      
	      @Test

	      public void testcase7 () throws InterruptedException {
	    	  
	    	  WebElement addtocart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
				addtocart.click();
				Thread.sleep(2000);
				
				WebElement carticon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
				carticon.click();
				Thread.sleep(2000);
				
				WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
				checkout.click();
				Thread.sleep(2000);
				
				WebElement firstname = driver.findElement(By.id("first-name"));
				firstname.sendKeys("Maha");
				
				WebElement lastname = driver.findElement(By.id("last-name"));
				lastname.sendKeys("Lakshmi");
				Thread.sleep(2000);
				
				WebElement zipcode = driver.findElement(By.id("postal-code"));
				zipcode.sendKeys("560021");
				Thread.sleep(2000);
				
				WebElement con = driver.findElement(By.xpath("//input[@id='continue']"));
				con.click();
				Thread.sleep(2000);
				
				WebElement finish = driver.findElement(By.xpath("//button[@id='finish']"));
				finish.click();
				Thread.sleep(2000);
				
				WebElement backtohome = driver.findElement(By.xpath("//button[@id='back-to-products']"));
				backtohome.click();
				Thread.sleep(2000);
	   	  
	      }
	      
	      @AfterMethod

	      public void testcase8 () {
	    	  
	    	  driver.quit();
	   	
	      }

}
