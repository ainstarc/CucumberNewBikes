Feature: New Bikes Features

@regression
	Scenario: Clicked on NewBikes
		Given the user navigates to the website
		When clicked on NewBikes
		And clicked on upcoming
		And clicked on allUpcomingBikes
		
@regression
	Scenario: Clicked on UpcomingBikes
		Given the user navigates to the website
		When the user hover on NewBikes
		And cliked on UpcomingBikes