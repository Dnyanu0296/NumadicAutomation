package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleTracking {

	@FindBy (xpath = "(//a[@href='/vehicles_tracking'])[2]")
	private WebElement vehicleTrackingTab;
	
	public VehicleTracking(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void vehicleTrackingButton() {
		
		vehicleTrackingTab.click();
	}
}
