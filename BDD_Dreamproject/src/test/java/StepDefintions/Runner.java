package StepDefintions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Featurefiles/OpenBrowser.feature",
glue= {"StepDefintions"},monochrome=true
//plugin = {"json:target/cucumber.json"}
		)
public class Runner {

}
