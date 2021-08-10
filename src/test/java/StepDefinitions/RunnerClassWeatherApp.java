package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


// need cucumber-junit && junit
@RunWith(Cucumber.class)

//can format output here
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"})

public class RunnerClassWeatherApp {

}
