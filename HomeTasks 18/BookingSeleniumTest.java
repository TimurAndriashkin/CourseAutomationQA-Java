package first_package;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingSeleniumTest {
	private WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void openSite() {
		driver.get("https://booking.com/");
	}

	@Test
	public void testBooking() {

		WebElement searchLine = findElementByXpath(driver, ".//input[@aria-label=\"Type your destination\"]");
		searchLine.sendKeys("Москва");
		WebElement searchCheckIn = findElementByXpath(driver, "(.//button[@tabindex=\"0\"])[1]");
		searchCheckIn.click();
		WebElement searchCheckInDate = findElementByXpath(driver, ".//td[@data-date=\"2018-11-23\"]");
		searchCheckInDate.click();
		WebElement searchCheckOutDate = findElementByXpath(driver, ".//td[@data-date=\"2018-12-02\"]");
		searchCheckOutDate.click();
		WebElement searchAmountofPeople = findElementByXpath(driver, ".// label[@id=\"xp__guests__toggle\"]");
		searchAmountofPeople.click();
		WebElement searchDropDownOfAmount = findElementByXpath(driver, ".//select[@id=\"group_adults\"]");
		searchDropDownOfAmount.click();
		WebElement searchAmountOfAdultsInDropDown = findElementByXpath(driver,
				".//select[@id=\"group_adults\"]//option[@value=\"2\"]");
		searchAmountOfAdultsInDropDown.click();
		searchAmountofPeople.click();
		WebElement searchSubmitButton = findElementByXpath(driver, ".// button[@data-sb-id=\"main\"]");
		searchSubmitButton.submit();
		List<WebElement> searchResults = findElementsByXpath(driver, ".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"]");
		assertFalse(searchResults.isEmpty(), "Hotels NOT found!");

// Part 2
		WebElement searchfilterScore = findElementByXpath(driver, ".//a[@data-category=\"bayesian_review_score\"]");
		searchfilterScore.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchTopHotel = findElementByXpath(driver,
				"(.//a[@class=\"b-button b-button_primary sr_cta_button\"])[1]");
		searchTopHotel.click();
		WebElement searchTopHotelRate = findElementByXpath(driver, "(.//div[@class=\"bui-review-score__badge\"])[1]");
		System.out.println("Rate of the top hotel is: " + searchTopHotelRate.getText());

		System.out.println(searchResults.size());

		ArrayList<String> tabList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabList.get(tabList.size() - 1));
		WebElement topHotelRate = findElementByXpath(driver, "(.//div[@class=\"bui-review-score__badge\"])[1]");
		String stringRate = topHotelRate.getText();
		stringRate.trim();
		double numberRate = Double.parseDouble(stringRate);
		System.out.println(numberRate);
		assertTrue(numberRate >= 9.0, "Hotels rating is lower than 9!");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	public static WebElement findElementByXpath(WebDriver driver, String xPath) {
		WebElement webElement = driver.findElement(By.xpath(xPath));
		return webElement;
	}

	public static List<WebElement> findElementsByXpath(WebDriver driver, String xPath) {
		List<WebElement> webElement = driver.findElements(By.xpath(xPath));
		return webElement;
	}

}