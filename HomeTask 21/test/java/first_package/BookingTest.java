package first_package;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BookingTest {
	private static WebDriver driver;
	private static HotelPage hotelPage;
	private static MainPage mainPage;
	private static SearchResultsPage searchResultsPage;
	private static double actualRate;

	@BeforeClass
	public void beforeClass()

	{
		driver = new ChromeDriver();
		hotelPage = new HotelPage(driver);
		mainPage = new MainPage(driver);
		searchResultsPage = new SearchResultsPage(driver);
		driver.get("http://booking.com");
	}

	@Test
	public void bookingTest1() {
		mainPage.inputSearchData("Москва");
		mainPage.inputCheckInAndOutData();
		mainPage.submitSearch();
		assertFalse(searchResultsPage.getSearchResults().isEmpty(), "Hotels NOT found!");

	}

	@Test
	public void bookingTest2() {
		driver.get("http://booking.com");
		mainPage.inputSearchData("Москва");
		mainPage.inputCheckInAndOutData();
		mainPage.submitSearch();
		searchResultsPage.filterHotelsByRate();
		searchResultsPage.waitInvisibilityOfIframe(driver);
		searchResultsPage.openTopHotelPage();
		searchResultsPage.switchToNextWindow(driver);
		actualRate = hotelPage.getTopHotelRate();
		assertTrue(actualRate >= 9.0, "Hotels rating is lower than 9!");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
