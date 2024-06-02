package StepDefinitions;

import Pages._006_to_007_DialogContent;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _007_StepDefinitions {

    _006_to_007_DialogContent dialogContent = new _006_to_007_DialogContent();

    @And("The user clicks to the restore message icon")
    public void theUserClicksToTheRestoreMessageIcon() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.restoreIcon);
    }

    @Then("The user should see the confirmation of the restoration message")
    public void theUserShouldSeeTheConfirmationOfTheRestorationMessage() {
        Tools.Bekle(1);
        dialogContent.verifyContainsText(dialogContent.restoredMessage, "Message successfully restored from trash");
    }
}
