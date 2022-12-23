package qatesting.october;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePageSL extends BasePageSL {

	public ProfilePageSL(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	By profileText = By.xpath("//div[@id='flash']");
	
	public String getProfileText() {
		return getText(profileText);
	}

}
