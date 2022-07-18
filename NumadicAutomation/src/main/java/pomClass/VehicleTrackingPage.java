package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleTrackingPage {

	@FindBy (xpath = "(//button[@type='button'])[2]")
	private WebElement CheckUploadVRN;
	
	@FindBy (xpath = "(//span[@class='ant-modal-close-x'])[1]")
	private WebElement closeUploadVRN;
	
	@FindBy (xpath = "(//button[@type='button'])[3]")
	private WebElement checkRequestReport;
	
	@FindBy (xpath = "(//span[@class='ant-modal-close-x'])[2]")
	private WebElement closeRequestReport;
	
	@FindBy (xpath = "(//button[@type='button'])[4]")
	private WebElement CheckRequestVehicle;
	
	@FindBy (xpath = "(//span[@class='ant-modal-close-x'])[3]")
	private WebElement closeRequestVehicle;
	
	public VehicleTrackingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void vehicleTrackingPageCheck() {
		CheckUploadVRN.click();
		closeUploadVRN.click();
		checkRequestReport.click();
		closeRequestReport.click();
		CheckRequestVehicle.click();
		closeRequestVehicle.click();
	}
}
