package first_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MailTests {

	private static WebDriver driver;
	private static LoginPage loginPage;
	private static MailPage mailPage;
	private static SpamPage spamPage;
	private static final int AMOUNT = 3;
	private WebDriverWait wait;

	@BeforeClass
	public void beforeClass()

	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage = new LoginPage(driver);
		mailPage = new MailPage(driver);
		spamPage = new SpamPage(driver);
		driver.get("http://mail.ru");
		wait = new WebDriverWait(driver, 10);
	}

	@Test
	public void moveToSpamTest() {
		loginPage.login("johny.walker.93", "4632132Timik");
		mailPage.moveToSpam();
	}

	@Test
	public void removeFromSpamTest() {
		loginPage.login("johny.walker.93", "4632132Timik");
		mailPage.openSpam();
		explictWait(spamPage.getSpamCheckBoxies());
		explictWait(spamPage.getSpamCheckBoxies().get(0));
		spamPage.removeFromSpam();

	}

	@Test
	public void sendGroupLetterTest() {
		loginPage.login("johny.walker.93", "4632132Timik");
		mailPage.createGroupLetter(driver, "Hello World", "xtimikx@mail.ru", "xxxtimikxxx@mail.ru");
	}

	@Test
	public void markThreeLetterTest() {
		loginPage.login("johny.walker.93", "4632132Timik");
		mailPage.markThreeLetter(AMOUNT);
	}

	@Test
	public void unmarkLettersTest() {
		loginPage.login("johny.walker.93", "4632132Timik");
		mailPage.unmarkLetters(AMOUNT);
	}

	private void explictWait(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	private void explictWait(List<WebElement> listOfElements) {
		wait.until(ExpectedConditions.visibilityOfAllElements(listOfElements));
	}

	@AfterMethod
	public void afterMethod() {
		loginPage.logout();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
