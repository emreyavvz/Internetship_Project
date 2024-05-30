package StepDefinitions;

import Pages._001_to_005_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class _004_StepDefinitions {
    _001_to_005_DialogContent dialogContent = new _001_to_005_DialogContent();

    @And("The user clicks to the messaging button")
    public void theUserClicksToTheMessagingButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.messaging);
    }

    @And("The user clicks to the new message button")
    public void theUserClicksToTheNewMessageButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.newMessage);
    }

    @Then("The user should be at the new messages page")
    public void theUserShouldBeAtTheNewMessagesPage() {
        Tools.Bekle(1);
        String currentURL = GWD.getDriver().getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        Assert.assertTrue(currentURL.contains("https://test.mersys.io/user-messages/new"), "Test Failed");
    }

    @And("The user clicks to the inbox button")
    public void theUserClicksToTheInboxButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.inbox);
    }

    @Then("The user should be at the inbox page")
    public void theUserShouldBeAtTheInboxPage() {
        Tools.Bekle(1);
        String currentURL = GWD.getDriver().getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        Assert.assertTrue(currentURL.contains("https://test.mersys.io/user-messages/list/inbox"), "Test Failed");
    }

    @And("The user clicks to the outbox button")
    public void theUserClicksToTheOutboxButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.outbox);
    }

    @Then("The user should be at the outbox page")
    public void theUserShouldBeAtTheOutboxPage() {
        Tools.Bekle(1);
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("https://test.mersys.io/user-messages/list/outbox"), "Test Failed");
    }

    @And("The user clicks to the trash button")
    public void theUserClicksToTheTrashButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.trash);
    }

    @Then("The user should be at the trash page")
    public void theUserShouldBeAtTheTrashPage() {
        Tools.Bekle(1);
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("https://test.mersys.io/user-messages/list/trash"), "Test Failed");
    }
}
