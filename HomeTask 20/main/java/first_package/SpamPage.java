package first_package;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpamPage {

	@FindBy(xpath = ".//div[@class='js-item-checkbox b-datalist__item__cbx' and not(ancestor::div[contains(@style,'display: none')])]")
	private List<WebElement> spamCheckBoxies;

	@FindBy(xpath = ".//div[@data-name=\"noSpam\"]")
	private WebElement notSpamButton;

	public SpamPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public void removeFromSpam() {
		spamCheckBoxies.get(0).click();
		notSpamButton.click();
	}

	List<WebElement> getSpamCheckBoxies() {
		return spamCheckBoxies;
	}
}
