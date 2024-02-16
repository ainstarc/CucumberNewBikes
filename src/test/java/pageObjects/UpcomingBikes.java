package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpcomingBikes extends BasePage {

	public UpcomingBikes(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='New Bikes']")
	private WebElement newBikes;

	public void newBikeHover() {
		actions.moveToElement(newBikes).perform();
		sleep(3000);
	}

}
