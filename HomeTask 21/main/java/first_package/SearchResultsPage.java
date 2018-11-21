package first_package;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage {

	@FindBy(xpath = ".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"]")
	private List<WebElement> searchResults;

	@FindBy(xpath = ".//a[@data-category=\"bayesian_review_score\"]")
	private WebElement searchfilterScore;

	@FindBy(xpath = ".//*[@id='utag_59_iframe']")
	private WebElement searchIframe;

	@FindBy(xpath = ".//div [@class=\"sr-usp-overlay sr-usp-overlay--wide\"]")
	private WebElement unknowElementForWait;

	@FindBy(xpath = "(.//a[@class=\"hotel_name_link url\"])[1]")
	private WebElement searchTopHotel;

	public SearchResultsPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public void filterHotelsByRate() {
		searchfilterScore.click();
	}

	public void openTopHotelPage() {
		searchTopHotel.click();
	}

	List<WebElement> getSearchResults() {
		return searchResults;
	}

	public void waitInvisibilityOfIframe(WebDriver driver) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(searchIframe));
	}

	public void waitInvisibilityOfUnknowElementForWait(WebDriver driver) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(unknowElementForWait));
	}

	public void switchToNextWindow(WebDriver driver) {
		ArrayList<String> tabList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabList.get(tabList.size() - 1));
	}
}
