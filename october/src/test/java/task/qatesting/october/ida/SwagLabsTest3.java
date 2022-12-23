package task.qatesting.october.ida;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//run all 
public class SwagLabsTest3 extends BaseSLTest {
	
	@Test
	public void testlogin() {
	
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
	
		
		driver.get().findElement(By.xpath("//input[@id='user-name']")).sendKeys("wrongusername");
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
		
	
		driver.get().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("passwordsalah");
		driver.get().findElement(By.xpath("//input[@id='login-button']")).click();
		String actualText = driver.get().findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
		String expectedText = "Epic sadface: Username and password do not match any user in this service";
		System.out.println(actualText);
		System.out.println(expectedText);
		Assert.assertTrue(actualText.contains(expectedText));
		
		
	}
}
