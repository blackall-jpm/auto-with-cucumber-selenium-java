package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestWebApp {
	
	WebDriver driver = null;
	
	@Given("user is on the weather app web page")
	public void user_is_on_the_weather_app_web_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user_is_on_the_weather_app_web_page()");
	    String projPath = System.getProperty("user.dir");
	    System.out.println("user_is_on_the_weather_app_web_page() - proj path= " + projPath);

	    System.setProperty("webriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe" );
	    
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.navigate().to("https://master.d2wb3j6snvm641.amplifyapp.com");
	}

	@And("focus is on the search box")
	public void focus_is_on_the_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("focus_is_on_the_search_box()");
	}

	@When("the user enters a city")
	public void the_user_enters_a_city() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("the_user_enters_a_city()");
	}

	@And("the user hits return")
	public void the_user_hits_return() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("the_user_hits_return()");
	}

	@Then("the web page updates the weather")
	public void the_web_page_updates_the_weather() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("the_user_hits_return()");
	}


}
