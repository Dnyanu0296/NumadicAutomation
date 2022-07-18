package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginApplication {

	@FindBy (xpath = "(//input[@id='number'])[2]")
	private WebElement mobileNumber;
	
	@FindBy (xpath = "(//button[@style='width: 100%; height: 44px;'])[2]")
	private WebElement sendOTP;
	
	public LoginApplication(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendMobileNumber() {
		
		mobileNumber.sendKeys("7822846090");
		sendOTP.click();
	}
}
