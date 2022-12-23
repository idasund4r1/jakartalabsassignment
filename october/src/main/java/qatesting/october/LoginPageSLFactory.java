package qatesting.october;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageSLFactory extends BasePageSL {
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;

	public LoginPageSLFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void inputUsername(String usernameInput) {
		username.sendKeys(usernameInput);
	}
	public void inputPassword(String passwordInput) {
		password.sendKeys(passwordInput);
	}
	public void clickLoginButton() {
		loginBtn.click();
	}

}
