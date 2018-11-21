package first_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	@FindBy(xpath = ".//input[@aria-label=\"Type your destination\"]")
	private WebElement searchField;

	@FindBy(xpath = "(.//button[@tabindex=\"0\"])[1]")
	private WebElement calendar;

	@FindBy(xpath = ".//td[@data-date=\"2018-11-23\"]")
	private WebElement checkInDate;

	@FindBy(xpath = ".//td[@data-date=\"2018-12-02\"]")
	private WebElement checkOutDate;

	@FindBy(xpath = ".// button[@data-sb-id=\"main\"]")
	private WebElement submitButton;

	public MainPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public void inputSearchData(String city) {
		searchField.clear();
		searchField.sendKeys(city);
	}

	public void inputCheckInAndOutData() {
		calendar.click();
		checkInDate.click();
		checkOutDate.click();
	}

	public void submitSearch() {
		submitButton.submit();
	}

}
