package qatesting.october;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageSL {

	static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
	
	public BasePageSL(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		this.driver= driver;
		this.explicitWait = explicitWait;
	}
	
	public void clickAndWait(By locator) {
		driver.get().findElement(locator).click();
	}
	
	public void setText(By locator, String text) {
		driver.get().findElement(locator).sendKeys(text);
	}
	
	public String getText(By locator) {
		return driver.get().findElement(locator).getText();
	}

}
