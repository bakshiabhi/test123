package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/TestFeature",glue={"steps"} ,tags={"@test"})
public class testrunner {
	

	//@CucumberOptions(strict = false, features = "Features", tags={"@test.feature"},

}


//@RunWith(Cucumber.class)

//@CucumberOptions(strict = false, features = "Features", tags={"@ProductDataRegression"},