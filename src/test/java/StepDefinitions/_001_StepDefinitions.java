package StepDefinitions;

import Pages._001_to_005_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _001_StepDefinitions {

    _001_to_005_DialogContent dialogContent = new _001_to_005_DialogContent();

    @Given("The user is on the login page")
    public void theUserIsOnTheLoginPage() {
        GWD.getDriver().get("https://test.mersys.io");
    }

    @When("The user enters a valid username and password")
    public void theUserEntersAValidUsernameAndPassword() {
        dialogContent.mySendKeys(dialogContent.username, "Student_5");
        dialogContent.mySendKeys(dialogContent.password, "S12345");
    }

    @And("The user clicks the login button")
    public void theUserClicksTheLoginButton() {
        dialogContent.myClick(dialogContent.login);
    }

    @Then("The user should be redirected to the home page")
    public void theUserShouldBeRedirectedToTheHomePage() {
        Tools.Bekle(2);
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("https://test.mersys.io/user-courses"), "Test Failed");
    }
}
