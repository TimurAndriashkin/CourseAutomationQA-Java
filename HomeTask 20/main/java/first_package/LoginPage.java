package first_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = ".//input[@id=\"mailbox:login\"]")
	private WebElement loginField;

	@FindBy(xpath = ".//input[@id=\"mailbox:password\"]")
	private WebElement passField;

	@FindBy(xpath = ".//input[@class=\"o-control\"]")
	private WebElement loginButton;

	@FindBy(xpath = ".//a[@id='PH_logoutLink']")
	private WebElement logoutLink;

	public LoginPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public void login(String login, String password) {
		loginField.clear();
		loginField.sendKeys(login);
		passField.clear();
		passField.sendKeys(password);
		loginButton.submit();
	}

	public void logout() {
		logoutLink.click();
	}
}
