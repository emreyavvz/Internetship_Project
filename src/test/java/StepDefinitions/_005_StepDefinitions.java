package StepDefinitions;

import Pages._001_to_005_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _005_StepDefinitions {

    _001_to_005_DialogContent dialogContent = new _001_to_005_DialogContent();

    @And("The user clicks add receivers button")
    public void theUserClicksAddReceiversButton() {
        dialogContent.myClick(dialogContent.addRecievers);
    }

    @And("The user types {string} to the reciever input")
    public void theUserTypesStuToTheRecieverInput(String name) {
        dialogContent.mySendKeys(dialogContent.recieverInput, name);
    }

    @And("The user clicks a student")
    public void theUserClicksAStudent() {
        Tools.Bekle(2);
        dialogContent.myClick(dialogContent.student1);
    }

    @And("The user clicks add button")
    public void theUserClicksAddButton() {
        Tools.Bekle(2);
        dialogContent.myClick(dialogContent.add);

    }

    @And("The user clicks a teacher")
    public void theUserClicksATeacher() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.teacher1);
    }

    @And("The user clicks add and exit button")
    public void theUserClicksAddAndExitButton() {
        Tools.Bekle(2);
        dialogContent.myClick(dialogContent.addAndExit);
    }

    @And("The user types the subject of the mail")
    public void theUserTypesTheSubjectOfTheMail() {
        Tools.Bekle(1);
        dialogContent.mySendKeys(dialogContent.subjectTextField, "git branching");
    }

    @And("The user types the message")
    public void theUserTypesTheMessage() {
        Tools.Bekle(2);
        GWD.getDriver().switchTo().frame(0);
        dialogContent.mySendKeys(dialogContent.messageTextField, "How can I create a new branch from my git repo?");
        GWD.getDriver().switchTo().defaultContent();
    }

    @And("The user clicks the attach files button")
    public void theUserClicksTheAttachFilesButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.attachFiles);
    }

    @And("The user clicks the from local button")
    public void theUserClicksTheFromLocalButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.fromLocalButton);
    }

    @And("The user writes Empty Pdf and presses enter")
    public void theUserWritesEmptyPdfAndPressesEnter() {
        Tools.Bekle(1);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.setAutoDelay(100);
        String fileName = "Empty Pdf";

        for (char c : fileName.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    @Then("The user should see the message")
    public void theUserShouldSeeTheMessage() {
        dialogContent.verifyContainsText(dialogContent.successMessage, "Message Successfully sent");
    }

    @And("The user clicks the send button")
    public void theUserClicksTheSendButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.sendButton);
        Tools.Bekle(3);
    }

    @Then("The user should see the message in the outbox")
    public void theUserShouldSeeTheMessageInTheOutbox() {
        Tools.Bekle(1);
        dialogContent.verifyContainsText(dialogContent.outboxMessage, "git branching");
    }
}
