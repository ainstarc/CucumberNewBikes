package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	WebDriver driver;
	Properties p;

	@Before
	public void setup() throws IOException {
		driver = BaseClass.initializeBrowser();

		p = BaseClass.getProperties();
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();

	}

	@After
	public void tearDown(Scenario scenario) {
		sleep(5000);
		driver.quit();

	}

	public void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
