package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page.AddNewAccountPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddNewAccouttest {
	WebDriver driver;

	ExcelReader reader = new ExcelReader("ExcelData/Book1.xlsx");
	String UserName = reader.getCellData("Logininfo", "username", 2);
	String Password = reader.getCellData("Logininfo", "password", 2);
	String AccountTitle = reader.getCellData("addaccount", "accountTitle", 2);
	String Description = reader.getCellData("addaccount", "description", 2);
	String Balance = reader.getCellData("addaccount", "initialBalance", 2);
	String AccountNum = reader.getCellData("addaccount", "accountNumber", 2);
	String ContactPerson = reader.getCellData("addaccount", "contactPerson", 2);
	String Phone = reader.getCellData("addaccount", "phone", 2);

	@Test
	public void validUserShouldLogin() throws InterruptedException {
		driver = BrowserFactory.startBrowser();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(UserName);
		loginPage.enterPassword(Password);
		loginPage.clickSiginButton();

		AddNewAccountPage addAccout = PageFactory.initElements(driver, AddNewAccountPage.class);
		Thread.sleep(2000);
		addAccout.ClickOnBandAndCashButton();
		Thread.sleep(3000);
		addAccout.clickOnAddNewAccount();
		Thread.sleep(3000);
		addAccout.enterAccountTitle(AccountTitle);
		addAccout.enterAccountDescription(Description);
		addAccout.enterinitialBalance(Balance);
		addAccout.enterAccountNum(AccountNum);
		addAccout.enterContactPerson(ContactPerson);
		addAccout.enterPhoneNum(Phone);
		Thread.sleep(1000);
		addAccout.clickOnSubmitButton();
		Thread.sleep(1000);
		
		addAccout.clickOnListAccout();
		Thread.sleep(1000);
	
		
	}
@AfterMethod
public void close() {
	driver.close();
	driver.quit();
	
}
}
