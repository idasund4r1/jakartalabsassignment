package qatesting.october;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePageSLFactory extends BasePageSL {

	public ProfilePageSLFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	By profileText = By.xpath("//div[@id='flash']");
	
	public String getProfileText() {
		return getText(profileText);
	}

}
