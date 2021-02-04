package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {
	WebDriver driver;

	ExcelReader reader = new ExcelReader("ExcelData/Book1.xlsx");
	String UserName = reader.getCellData("Logininfo", "username", 2);
	String Password = reader.getCellData("Logininfo", "password", 2);
	
	@Test
	public void validUserShouldLogin() {
		driver = BrowserFactory.startBrowser();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(UserName);
		loginPage.enterPassword(Password);
		loginPage.clickSiginButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.validationDashboard();
	}
	@AfterMethod
	public void close() {
		driver.close();
		driver.quit();
	}
}
