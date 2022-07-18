package pomClass;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAndRequestVehicle {

	@FindBy (xpath = "//input[@placeholder='Search by vehicle no.']")
	private WebElement clickOnSearchBar;
	
	@FindBy (xpath = "(//button[@type='button'])[5]")
	private WebElement checkSearchBar;
	
	@FindBy (xpath = "(//input[@type='text'])[4]")
	private WebElement clickOnFleetName;
	
	@FindBy (xpath = "(//input[@type='text'])[5]")
	private WebElement clickOnFleetMobileNumber;
				
	@FindBy (xpath = "(//button[@type='button'])[13]")
	private WebElement clickOnSubmit;
	
	public SearchAndRequestVehicle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSearchBarAndSearchVehicle() {
		clickOnSearchBar.click();
		checkSearchBar.sendKeys("MH12TZ1250");
		checkSearchBar.click();
		clickOnFleetName.click();
		clickOnFleetName.sendKeys("Dnyaneshwar");
		clickOnFleetMobileNumber.click();
		clickOnFleetMobileNumber.sendKeys("7822846090");
		clickOnSubmit.click();
		
	}
}
