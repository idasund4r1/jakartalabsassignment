package task.qatesting.october.ida;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import qatesting.october.LoginPageSL;
import qatesting.october.ProfilePageSL;

//run all 
public class Swaglabstestfinishtransaction extends BaseSLTest {
	
	
	LoginPageSL loginPage = new LoginPageSL(driver, explicitWait);
	ProfilePageSL profilePage = new ProfilePageSL(driver, explicitWait);

	
	@Test
	public void testlogin() {
		driver.get().get("https://www.saucedemo.com/");
		driver.get().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.get().findElement(By.xpath("//input[@id='login-button']")).click();
		String actualText = driver.get().findElement(By.xpath("//span[@class='title']")).getText();
		String expectedText = "PRODUCTS";
		System.out.println(actualText);
		System.out.println(expectedText);
		Assert.assertTrue(actualText.contains(expectedText));
	
		
	}
	@Test
	public void testwrongusername() {
	
		driver.get().get("https://www.saucedemo.com/");
		driver.get().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.get().findElement(By.xpath("//input[@id='login-button']")).click();
		String actualText = driver.get().findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
		String expectedText = "Epic sadface: Username and password do not match any user in this service";
		System.out.println(actualText);
		System.out.println(expectedText);
		Assert.assertTrue(actualText.contains(expectedText));

	}
	@Test
	public void testwrongpassword() {
		
		driver.get().get("https://www.saucedemo.com/");
		driver.get().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.get().findElement(By.xpath("//input[@id='login-button']")).click();
		String actualText = driver.get().findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
		String expectedText = "Epic sadface: Username and password do not match any user in this service";
		System.out.println(actualText);
		System.out.println(expectedText);
		Assert.assertTrue(actualText.contains(expectedText));
	
	}
	@Test
	public void selectproduct() {
		
		driver.get().get("https://www.saucedemo.com/");
		driver.get().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.get().findElement(By.xpath("//input[@id='login-button']")).click();
		driver.get().findElement(By.xpath("//img[@alt='Sauce Labs Backpack']")).click();
		driver.get().findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.get().findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		driver.get().findElement(By.xpath("//button[@id='checkout']")).click();
		driver.get().findElement(By.xpath("//input[@id='first-name']")).sendKeys("Ida");
		driver.get().findElement(By.xpath("//input[@id='last-name']")).sendKeys("Sundari");
		driver.get().findElement(By.xpath("//input[@id='postal-code']")).sendKeys("454545");
		driver.get().findElement(By.xpath("//input[@id='continue']")).click();
		driver.get().findElement(By.xpath("//button[@id='finish']")).click();
		
	
	}
}
