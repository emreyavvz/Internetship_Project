package StepDefinitions;

import Pages._006_to_007_DialogContent;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _006_StepDefinitions {

    _006_to_007_DialogContent dialogContent = new _006_to_007_DialogContent();

    @And("The user clicks to the delete message icon")
    public void theUserClicksToTheDeleteMessageIcon() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.deleteMessage);
    }

    @And("The user clicks to the confirmation of the delete message")
    public void theUserClicksToTheConfirmationOfTheDeleteMessage() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.confirmDelete);
    }

    @Then("The user should see the Message successfully moved to trash! message")
    public void theUserShouldSeeTheMessageSuccessfullyMovedToTrashMessage() {
        Tools.Bekle(1);
        dialogContent.verifyContainsText(dialogContent.deletedMessage, "Message successfully moved to trash!");
    }

}
