package first_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage {

	@FindBy(xpath = "(.//div[@class=\"bui-review-score__badge\"])[1]")
	private WebElement topHotelRate;

	public HotelPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public double getTopHotelRate() {
		String stringRate = topHotelRate.getText();
		stringRate.trim();
		double numberRate = Double.parseDouble(stringRate);
		return numberRate;
	}

}
