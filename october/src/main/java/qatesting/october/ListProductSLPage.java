package qatesting.october;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListProductSLPage extends BasePageSL {

	public ListProductSLPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	By profileText = By.xpath("//span[@class='title']");
	
	public String getProfileText() {
		return getText(profileText);
	}

}
