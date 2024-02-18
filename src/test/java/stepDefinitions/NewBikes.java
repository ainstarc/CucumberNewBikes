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
		upcomingBikes.newBikesHover();
	}

	@When("clicked on NewBikes")
	public void clicked_on_new_bikes() {
		upcomingBikes.newBikesClick();
	}
	
	@When("clicked on upcoming")
	public void clicked_on_upcoming() {
		upcomingBikes.upcomingClick();
	}
	
	@When("clicked on allUpcomingBikes")
	public void clicked_on_all_upcoming_bikes() {
		upcomingBikes.allUpcomingBikesClick();
	}

	@When("cliked on UpcomingBikes")
	public void clicked_on_upcoming_bikes() {
		upcomingBikes.upcomingBikesClick();
	}
}
