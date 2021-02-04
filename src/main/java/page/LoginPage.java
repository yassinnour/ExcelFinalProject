package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		// Element Library

	}

	@FindBy(how = How.ID, using = "username")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.NAME, using = "password")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.NAME, using = "login")
	WebElement SIGIN_BUTTON_ELEMENT;
	// @FindBy(how =How.NAME, using = "password")WebElement PASSWORD_ELEMENT;

	// Methods to interact with elements

	public void enterUserName(String username) {

		USER_NAME_ELEMENT.sendKeys(username);
	}
	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		
	}
	public void clickSiginButton() {
		SIGIN_BUTTON_ELEMENT.click();
	}
}
