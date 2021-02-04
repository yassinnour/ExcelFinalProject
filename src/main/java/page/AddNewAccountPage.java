package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddNewAccountPage extends BasePage {

	WebDriver driver;

	public AddNewAccountPage(WebDriver driver) {

		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement CLICK_ON_BANK_CASH_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement CLICK_ON_ADD_NEW_ACCOUNT_BUTTON_ELEMENT;
	@FindBy(how = How.ID, using = "account")
	WebElement ENTER_ACCOUT_TITLE_ELEMENT;
	@FindBy(how = How.ID, using = "description")
	WebElement ENTER_DESCRIPTION_ELEMENT;
	@FindBy(how = How.ID, using = "balance")
	WebElement ENTER_BALANCE_ELEMENT;
	@FindBy(how = How.ID, using = "account_number")
	WebElement ENTER_ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.ID, using = "contact_person")
	WebElement ENTER_CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.ID, using = "contact_phone")
	WebElement ENTER_CONTACT_PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@type='submit'and @class='btn btn-primary']")
	WebElement CLICK_SUBMIT_ELEMENT;
	@FindBy(how = How.LINK_TEXT, using = "List Accounts")
	WebElement CLICK_ON_LIST_ACCOUNT;
	// Methods to interact with

	public void ClickOnBandAndCashButton() {
		// waitForElement(driver,3,CLICK_ON_BANK_CASH_ELEMENT);
		CLICK_ON_BANK_CASH_ELEMENT.click();
	}

	public void clickOnAddNewAccount() {
		waitForElement(driver, 3, CLICK_ON_ADD_NEW_ACCOUNT_BUTTON_ELEMENT);
		CLICK_ON_ADD_NEW_ACCOUNT_BUTTON_ELEMENT.click();
	}

	String enteredTitle;

	public void enterAccountTitle(String accountTitle) {
		waitForElement(driver, 3, ENTER_ACCOUT_TITLE_ELEMENT);
		int randomNum = randomNumGenerator();
		enteredTitle = accountTitle + randomNum;
		ENTER_ACCOUT_TITLE_ELEMENT.sendKeys(enteredTitle);
	}

	public void enterAccountDescription(String Description) {

		ENTER_DESCRIPTION_ELEMENT.sendKeys(Description);
	}

	public void enterinitialBalance(String balance) {

		ENTER_BALANCE_ELEMENT.sendKeys(balance);
	}

	public void enterAccountNum(String accountNum) {

		ENTER_ACCOUNT_NUMBER_ELEMENT.sendKeys(accountNum);
	}

	public void enterContactPerson(String contact) {

		ENTER_CONTACT_PERSON_ELEMENT.sendKeys(contact);
	}

	public void enterPhoneNum(String phone) {
		ENTER_CONTACT_PHONE_ELEMENT.sendKeys(phone);
	}

	public void clickOnSubmitButton() {
		CLICK_SUBMIT_ELEMENT.click();
	}

	public void clickOnListAccout() {
		CLICK_ON_LIST_ACCOUNT.click();
	}

	// tbody/tr[2]/td[1]
	// tbody/tr[3]/td[1]
	// tbody/tr[4]/td[1]
	// tbody/tr[5]/td[1]

	String before_xpath = "//tbody/tr[";
	String after_xpath = "]/td[1]";

	//public void verifyEnteredAccountTitleAndDelete() throws InterruptedException {
		// for (int i = 2; i <= 10; i++) {
		// String newTitle = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();

	//	 System.out.println("=====" + newTitle);
		//System.out.println("+++++" + enteredTitle);
		// Assert.assertEquals("Entered name doesn't exists", enteredTitle, newTitle);

		// if (newTitle.contains(enteredTitle)){
			// Thread.sleep(3000);
			// System.out.println("Entered name exist");
		//	driver.findElement(By.xpath("//a[@id='did455']")).click();
		//	Thread.sleep(3000);
		//	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]")).click();
		//}

	//}
}