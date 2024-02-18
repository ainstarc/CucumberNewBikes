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

	public void newBikesHover() {
		actions.moveToElement(newBikes).perform();
		sleep(3000);
	}

	public void newBikesClick() {
		newBikes.click();
		sleep(3000);
	}

	@FindBy(xpath = "//li[text()='Upcoming']")
	private WebElement upcoming;

	@FindBy(xpath = "//a[text()='Upcoming Bikes']")
	private WebElement allUpcomingBikes;

	public void upcomingClick() {
		upcoming.click();
		sleep(3000);
	}

	public void allUpcomingBikesClick() {
//		allUpcomingBikes.click();
		jse.executeScript("arguments[0].click();", allUpcomingBikes);
	}

	@FindBy(xpath = "//span[text()='Upcoming Bikes']")
	private WebElement upcomingBikes;

	public void upcomingBikesClick() {
		upcomingBikes.click();
		sleep(3000);
	}

}
