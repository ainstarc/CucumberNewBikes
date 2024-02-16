package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.UpcomingBikes;

public class NewBikes {

	WebDriver driver;
	UpcomingBikes upcomingBikes;

	@Given("the user navigates to the website")
	public void the_user_navigates_to_the_website() {
		upcomingBikes = new UpcomingBikes(BaseClass.getDriver());
	}

	@When("the user hover on NewBikes")
	public void the_user_hover_on_new_bikes() {
		upcomingBikes.newBikeHover();
	}

}
