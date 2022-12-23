package qatesting.october;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageSL extends BasePageSL {
	
	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@id='login-button']");

	public LoginPageSL(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		
	}

	public void inputUsername(String usernameInput) {
		setText(username,usernameInput);
	}
	public void inputPassword(String passwordInput) {
		setText(password,passwordInput);
	}
	public void clickLoginButton() {
		clickAndWait(loginBtn);
	}

}
