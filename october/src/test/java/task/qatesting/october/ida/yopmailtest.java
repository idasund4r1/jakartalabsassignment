package task.qatesting.october.ida;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//run all 
public class yopmailtest extends BaseTestyopmail {
	
	@Test
	public void inputemail() {
		
		driver.get().get("https://yopmail.com/");
		driver.get().findElement(By.xpath("//input[@id='login']")).sendKeys("Automatio tes");
		
		WebElement iframe = driver.get().findElement(By.xpath("//input[@id='login']"));
		driver.get().findElement(By.xpath("//input[@id='login']")).sendKeys("sundariputri0201@gmail.com");
		driver.get().switchTo().parentFrame();
		driver.get().close();
	}
}