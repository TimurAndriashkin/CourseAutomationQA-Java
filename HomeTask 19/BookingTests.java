package first_package;

import static org.testng.Assert.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingTests {
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
	public void testBooking1() {
		WebElement searchLine = findElementByXpath(driver, ".//input[@aria-label=\"Type your destination\"]");
		searchLine.clear();
		searchLine.sendKeys("Paris");
		WebElement searchCheckIn = findElementByXpath(driver, "(.//button[@tabindex=\"0\"])[1]");
		searchCheckIn.click();
		WebElement searchCheckInDate = findElementByXpath(driver,
				".//td[@data-date='" + getDatePlusIncrement(3) + "']");
		searchCheckInDate.click();
		WebElement searchCheckOutDate = findElementByXpath(driver,
				".//td[@data-date='" + getDatePlusIncrement(10) + "']");
		searchCheckOutDate.click();
		WebElement searchSubmitButton = findElementByXpath(driver, ".// button[@data-sb-id=\"main\"]");
		searchSubmitButton.submit();
		WebElement searchFilterLowestPriceBudget = findElementByXpath(driver, ".//a[@data-id=\"pri-1\"]");
		System.out.println(searchFilterLowestPriceBudget.getText());
		String[] arrayPrice = searchFilterLowestPriceBudget.getText().split("[^0-9]+");
		int priceLimit = (Integer.parseInt(arrayPrice[arrayPrice.length - 2]) * 7);
		searchFilterLowestPriceBudget.click();
		WebElement searchFilterLowestPrice = findElementByXpath(driver, ".//a[@data-category=\"price\"]");
		searchFilterLowestPrice.click();
		List<WebElement> searchResults = findElementsByXpath(driver, ".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"]");
		assertFalse(searchResults.isEmpty(), "Hotels NOT found!");
		WebElement searchfilterScore = findElementByXpath(driver, ".//a[@data-category=\"bayesian_review_score\"]");
		searchfilterScore.click();
		(new WebDriverWait(driver, 10)).until(ExpectedConditions
				.invisibilityOfAllElements(driver.findElement(By.xpath(".//*[@id='utag_59_iframe']"))));
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(
				driver.findElement(By.xpath(".//div [@class=\"sr-usp-overlay sr-usp-overlay--wide\"]"))));
		WebElement searchTopHotel = findElementByXpath(driver, "(.//a[@class=\"hotel_name_link url\"])[1]");
		searchTopHotel.click();
		switchToNextWindow(driver);
		WebElement searchPrice = findElementByXpath(driver, "(.//span[contains(text(), 'BYN')])[1]");
		System.out.println("Our price = " + Integer.parseInt(searchPrice.getText().replaceAll("[^0-9]", "")));
		System.out.println("Price Limit = " + priceLimit);
		assertTrue(Integer.parseInt(searchPrice.getText().replaceAll("[^0-9]", "")) <= priceLimit, "Incorrect price!");

	}

	@Test
	public void testBooking2() {
		WebElement searchLine = findElementByXpath(driver, ".//input[@aria-label=\"Type your destination\"]");
		searchLine.clear();
		searchLine.sendKeys("Paris");
		WebElement searchCheckIn = findElementByXpath(driver, "(.//button[@tabindex=\"0\"])[1]");
		searchCheckIn.click();
		WebElement searchCheckInDate = findElementByXpath(driver,
				".//td[@data-date='" + getDatePlusIncrement(3) + "']");
		searchCheckInDate.click();
		WebElement searchCheckOutDate = findElementByXpath(driver,
				".//td[@data-date='" + getDatePlusIncrement(10) + "']");
		searchCheckOutDate.click();
		WebElement searchDropDownLabel = findElementByXpath(driver, ".//label[@id=\"xp__guests__toggle\"]");
		searchDropDownLabel.click();
		List<WebElement> searchPlusButtons = findElementsByXpath(driver,
				".//button[@data-bui-ref=\"input-stepper-add-button\"]");
		if (searchPlusButtons.isEmpty() == false) {
			multipleClick(searchPlusButtons.get(0), 1);
			multipleClick(searchPlusButtons.get(1), 2);
		} else {
			WebElement searchDropDownRoom = findElementByXpath(driver, ".//select[@id=\"no_rooms\"]");
			Select roomSelect = new Select(searchDropDownRoom);
			roomSelect.selectByIndex(1);
			WebElement searchDropDownAdults = findElementByXpath(driver, ".//select[@id=\"group_adults\"]");
			Select roomAdults = new Select(searchDropDownAdults);
			roomAdults.selectByIndex(3);
		}

		WebElement searchSubmitButton = findElementByXpath(driver, ".// button[@data-sb-id=\"main\"]");
		searchSubmitButton.submit();
		WebElement searchFilterHighestPriceBudget = findElementByXpath(driver, ".//a[@data-id=\"pri-5\"]");
		String[] arrayPrice = searchFilterHighestPriceBudget.getText().split("[^0-9]+");
		int priceLimit = (Integer.parseInt(arrayPrice[arrayPrice.length - 2]) * 7);
		System.out.println(priceLimit);
		searchFilterHighestPriceBudget.click();
		WebElement searchFilterLowestPrice = findElementByXpath(driver, ".//a[@data-category=\"price\"]");
		searchFilterLowestPrice.click();
		(new WebDriverWait(driver, 10)).until(ExpectedConditions
				.invisibilityOfAllElements(driver.findElement(By.xpath(".//*[@id='utag_59_iframe']"))));
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(
				driver.findElement(By.xpath(".//div [@class=\"sr-usp-overlay sr-usp-overlay--wide\"]"))));
		WebElement searchTopHotel = findElementByXpath(driver, "(.//a[@class=\"hotel_name_link url\"])[1]");
		searchTopHotel.click();
		switchToNextWindow(driver);
		WebElement searchPrice = findElementByXpath(driver, "(.//span[contains(text(), 'BYN')])[1]");
		System.out.println("Our price = " + Integer.parseInt(searchPrice.getText().replaceAll("[^0-9]", "")));
		System.out.println("Price Limit = " + priceLimit);
		assertTrue(Integer.parseInt(searchPrice.getText().replaceAll("[^0-9]", "")) >= priceLimit, "Incorrect price!");

	}

	@Test
	public void testBooking3() {
		WebElement searchLine = findElementByXpath(driver, ".//input[@aria-label=\"Type your destination\"]");
		searchLine.clear();
		searchLine.sendKeys("Paris");
		WebElement searchCheckIn = findElementByXpath(driver, "(.//button[@tabindex=\"0\"])[1]");
		searchCheckIn.click();
		WebElement searchCheckInDate = findElementByXpath(driver,
				".//td[@data-date='" + getDatePlusIncrement(3) + "']");
		searchCheckInDate.click();
		WebElement searchCheckOutDate = findElementByXpath(driver,
				".//td[@data-date='" + getDatePlusIncrement(10) + "']");
		searchCheckOutDate.click();
		WebElement searchDropDownLabel = findElementByXpath(driver, ".//label[@id=\"xp__guests__toggle\"]");
		searchDropDownLabel.click();
		List<WebElement> searchPlusButtons = findElementsByXpath(driver,
				".//button[@data-bui-ref=\"input-stepper-add-button\"]");
		if (searchPlusButtons.isEmpty() == false) {
			multipleClick(searchPlusButtons.get(0), 1);
			multipleClick(searchPlusButtons.get(1), 2);
		} else {
			WebElement searchDropDownRoom = findElementByXpath(driver, ".//select[@id=\"no_rooms\"]");
			Select roomSelect = new Select(searchDropDownRoom);
			roomSelect.selectByIndex(1);
			WebElement searchDropDownAdults = findElementByXpath(driver, ".//select[@id=\"group_adults\"]");
			Select roomAdults = new Select(searchDropDownAdults);
			roomAdults.selectByIndex(3);
		}

		WebElement searchSubmitButton = findElementByXpath(driver, ".// button[@data-sb-id=\"main\"]");
		searchSubmitButton.submit();
		WebElement searchFilterHighestPriceBudget = findElementByXpath(driver, ".//a[@data-id=\"pri-5\"]");
		String[] arrayPrice = searchFilterHighestPriceBudget.getText().split("[^0-9]+");
		int priceLimit = (Integer.parseInt(arrayPrice[arrayPrice.length - 2]) * 7);
		System.out.println(priceLimit);
		searchFilterHighestPriceBudget.click();
		WebElement searchFilterLowestPrice = findElementByXpath(driver, ".//a[@data-category=\"price\"]");
		searchFilterLowestPrice.click();
		(new WebDriverWait(driver, 10)).until(ExpectedConditions
				.invisibilityOfAllElements(driver.findElement(By.xpath(".//*[@id='utag_59_iframe']"))));
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(
				driver.findElement(By.xpath(".//div [@class=\"sr-usp-overlay sr-usp-overlay--wide\"]"))));
		WebElement searchTopHotel = findElementByXpath(driver, "(.//a[@class=\"hotel_name_link url\"])[1]");
		searchTopHotel.click();
		switchToNextWindow(driver);
		WebElement searchPrice = findElementByXpath(driver, "(.//span[contains(text(), 'BYN')])[1]");
		System.out.println("Our price = " + Integer.parseInt(searchPrice.getText().replaceAll("[^0-9]", "")));
		System.out.println("Price Limit = " + priceLimit);
		assertTrue(Integer.parseInt(searchPrice.getText().replaceAll("[^0-9]", "")) >= priceLimit, "Incorrect price!");
		Select reserveFirstRoom = new Select(findElementByXpath(driver, "(.//select[@class=\"hprt-nos-select\"])[1]"));
		reserveFirstRoom.selectByIndex(1);
		(new WebDriverWait(driver, 10)).until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//button[contains(text(),'reserve')]")));
		WebElement searchWillReserveButton = findElementByXpath(driver, ".//button[contains(text(),'reserve')]");
		searchWillReserveButton.click();
		WebElement searchRadioButton = findElementByXpath(driver, "(.//input[@type=\"radio\"])[2]");
		searchRadioButton.click();
		Select mrsSelected = new Select(findElementByXpath(driver, ".//select[@name=\"booker_title\"]"));
		mrsSelected.selectByIndex(1);
		WebElement searchFirstNameField = findElementByXpath(driver, ".//input[@name=\"firstname\"]");
		searchFirstNameField.clear();
		searchFirstNameField.sendKeys("Tim");
		WebElement searchLastNameField = findElementByXpath(driver, ".//input[@name=\"lastname\"]");
		searchLastNameField.clear();
		searchLastNameField.sendKeys("Richards");
		WebElement searchEmailField = findElementByXpath(driver, "(.//input[@name=\"email\"])[1]");
		searchEmailField.clear();
		searchEmailField.sendKeys("test123@mail.ru");
		WebElement searchConfirmMailField = findElementByXpath(driver, ".//input[@id=\"email_confirm\"]");
		searchConfirmMailField.clear();
		searchConfirmMailField.sendKeys("test123@mail.ru");
		WebElement searchBookingForRadioButton = findElementByXpath(driver, ".//input[@id=\"notstayer_false\"]");
		searchBookingForRadioButton.click();
		WebElement searchFinalDetailsButton = findElementByXpath(driver,
				".//button[contains(@class, \"submit_holder_button\")]");
		searchFinalDetailsButton.click();
		WebElement searchPhone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		searchPhone.sendKeys("291234567");
		WebElement searchPayNowButton = findElementByXpath(driver, "//input[@value='pay-now']");
		searchPayNowButton.click();
		List<WebElement> searchAdress = driver.findElements(By.xpath("//input[@id=\"address1\"]"));
		if (searchAdress.isEmpty() == false) {
			searchAdress.get(0).clear();
			searchAdress.get(0).sendKeys("asdasdasddasd");
			WebElement searchCity = driver.findElement(By.xpath("//input[@id=\"city\"]"));
			searchCity.clear();
			searchCity.sendKeys("testcity");
			WebElement searchZip = driver.findElement(By.xpath("//input[@id=\"zip\"]"));
			searchZip.clear();
			searchZip.sendKeys("22233221");
		}
		Select searchCreditCardType = new Select(driver.findElement(By.xpath("//*[@id=\"cc_type\"]")));
		searchCreditCardType.selectByIndex(2);
		WebElement cardNumber = driver.findElement(By.xpath("//*[@id=\"cc_number\"]"));
		cardNumber.sendKeys("4242424242424242");
		Select searchExpirationDate = new Select(driver.findElement(By.xpath("//*[@id=\"cc_month\"]")));
		searchExpirationDate.selectByIndex(10);
		WebElement searchCvc = driver.findElement(By.xpath("//*[@id=\"cc_cvc\"]"));
		searchCvc.clear();
		searchCvc.sendKeys("123");
		WebElement searchSumittBookingButton = findElementByXpath(driver, "(.//button[@type=\"submit\"])[2]");
		searchSumittBookingButton.submit();
		(new WebDriverWait(driver, 10)).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"bui-alert__description\"]")));
		WebElement searchMessage = findElementByXpath(driver, "(//span[@class=\"bui-alert__title\"]//p)[1]");
		String expected_results = ("Sorry, we were not able to take your payment.");
		System.out.println(searchMessage.getText().trim());
		Assert.assertEquals(searchMessage.getText().trim(), expected_results, "Erros messages are NOT equals");

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	private static String getDatePlusIncrement(int increment) {
		return LocalDate.from(new Date().toInstant().atZone(ZoneId.of("Europe/Moscow"))).plusDays(increment).toString();
	}

	public static WebElement findElementByXpath(WebDriver driver, String xPath) {
		WebElement webElement = driver.findElement(By.xpath(xPath));
		return webElement;
	}

	public static List<WebElement> findElementsByXpath(WebDriver driver, String xPath) {
		List<WebElement> webElement = driver.findElements(By.xpath(xPath));
		return webElement;
	}

	private void multipleClick(WebElement element, int clicks) {
		for (int i = 0; i < clicks; i++) {
			element.click();
		}

	}

	public static void switchToNextWindow(WebDriver driver) {
		ArrayList<String> tabList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabList.get(tabList.size() - 1));
	}
}
