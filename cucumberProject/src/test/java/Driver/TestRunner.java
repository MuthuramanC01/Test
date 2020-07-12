package Driver;

import cucumber.runtime.StepDefinition;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\muthuraman.c\\cucumberProject\\src\\test\\java\\FeatureFiles\\Login.feature", glue = "StepDefinition"
) //  features - all means dont give full path
public class TestRunner {

}
