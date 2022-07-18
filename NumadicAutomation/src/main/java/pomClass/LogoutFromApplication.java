package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutFromApplication {

	@FindBy (xpath = "//div[@class='ant-col']")
	private WebElement logoutApplicationlogo;
	
	@FindBy (xpath = "//span[text()='Logout']")
	private WebElement logoutApplication;
	
	public LogoutFromApplication(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void logoutFromApplication() {
		
		logoutApplicationlogo.click();
		logoutApplication.click();
	}
	
}
