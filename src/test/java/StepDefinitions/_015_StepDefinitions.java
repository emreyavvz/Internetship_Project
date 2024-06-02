package StepDefinitions;

import Pages._011_DialogContent;
import Utilities.Tools;
import io.cucumber.java.en.Then;

public class _015_StepDefinitions {
    _011_DialogContent dc = new _011_DialogContent();
    @Then("Success Update Color")
    public void successUpdate() {

        dc.verifyContainsText(dc.SuccessUpdate,"Profile successfully updated");
    }
}
