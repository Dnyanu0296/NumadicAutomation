package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClass.LoginApplication;
import pomClass.LogoutFromApplication;
import pomClass.SearchAndRequestVehicle;
import pomClass.VehicleTracking;
import pomClass.VehicleTrackingPage;

public class TestClass {

	WebDriver driver;
	LoginApplication loginApplication;
	VehicleTracking vehicleTracking;
	LogoutFromApplication logoutFromApplication;
	VehicleTrackingPage vehicleTrackingPage;
	SearchAndRequestVehicle searchAndRequestVehicle;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","H:\\Testing class\\Selenium\\New Chrome 2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void loginToApplication() throws InterruptedException {
		
		driver.get("https://app.newloads.com/login");
		driver.manage().window().maximize();
		loginApplication = new LoginApplication(driver);
		Thread.sleep(3000);
		loginApplication.sendMobileNumber();
		Thread.sleep(3000);
	}
	
	@Test (priority = 1)
	public void verifyVehicleTrackingButton() {
		
		vehicleTracking = new VehicleTracking(driver);
		vehicleTracking.vehicleTrackingButton();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		if(url.equals("https://app.newloads.com/vehicles_tracking") && title.endsWith("NewLoads")) {
			
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@Test (priority = 2)
	public void checkVehicleTrackingPage() {
		vehicleTrackingPage = new VehicleTrackingPage(driver);
		vehicleTrackingPage.vehicleTrackingPageCheck();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		if(url.equals("https://app.newloads.com/vehicles_tracking") && title.endsWith("NewLoads")) {
			
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@Test (priority = 3)
	public void searchRequestVehicle() {
		searchAndRequestVehicle = new SearchAndRequestVehicle(driver);
		searchAndRequestVehicle.clickOnSearchBarAndSearchVehicle();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		if(url.equals("https://app.newloads.com/vehicles_tracking") && title.endsWith("NewLoads")) {
			
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@AfterMethod
	public void logoutFromApplication() {
		
		logoutFromApplication= new LogoutFromApplication(driver);
		logoutFromApplication.logoutFromApplication();
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.close();
	}
	
}
