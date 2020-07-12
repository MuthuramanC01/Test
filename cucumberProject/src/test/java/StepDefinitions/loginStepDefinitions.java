package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class loginStepDefinitions {
    @Given("^User is on landing page$")
    public void user_OnLandingPage() {
        //navigate
    }

    @When("^User log into application with valid username and password$")
    public void valid_Login() {

    }

    @Then("^Home Page is loaded$")
    public void validate_LoginLoad() {
        System.out.println("EXIT");
    }

    @When("^User log into application with valid \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userLogIntoApplicationWithValidAndPassword(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
