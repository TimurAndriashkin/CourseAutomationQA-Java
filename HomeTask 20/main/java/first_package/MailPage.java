package first_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage {
	@FindBy(xpath = ".//div[@class='js-item-checkbox b-datalist__item__cbx' and not(ancestor::div[contains(@style,'display: none')])]")
	private List<WebElement> mailCheckBoxies;

	@FindBy(xpath = "(.//div[@data-shortcut-title=\"J\"])[1]")
	private WebElement spamButton;

	@FindBy(xpath = "(.//a[@data-bem=\"b-toolbar__btn\"])[1]")
	private WebElement createLetterButton;

	@FindBy(xpath = ".//textarea[@tabindex=\"4\"]")
	private WebElement recipientField;

	@FindBy(xpath = ".//input[@tabindex=\"7\"]")
	private WebElement themeField;

	@FindBy(xpath = ".//body[@class='mceContentBody compose2']")
	private WebElement textField;

	@FindBy(xpath = "(.//div[@data-name=\"send\"])[1]")
	private WebElement sendLetterButton;

	@FindBy(xpath = "(.//span[@class=\"b-nav__item__text\"])[3]")
	private WebElement openSpam;

	public MailPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public void moveToSpam() {
		mailCheckBoxies.get(0).click();
		spamButton.click();
	}

	public void openSpam() {
		openSpam.click();
	}

	public void createGroupLetter(WebDriver driver, String text, String... data) {
		createLetterButton.click();
		recipientField.clear();
		for (int i = 0; i < data.length; i++) {
			recipientField.sendKeys(data[i] + " ");
		}
		themeField.clear();
		themeField.sendKeys("Hello group");
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe")));
		textField.sendKeys(text);
		driver.switchTo().defaultContent();
		sendLetterButton.click();
	}

	public void markThreeLetter(int amount) {
		for (int i = 0; i < amount; i++) {
			mailCheckBoxies.get(i).click();
		}
	}

	public void unmarkLetters(int amount) {
		for (int i = 0; i < amount; i++) {
			mailCheckBoxies.get(i).click();
		}
		for (int i = amount - 1; i >= 0; i--) {
			mailCheckBoxies.get(i).click();
		}

	}
}
