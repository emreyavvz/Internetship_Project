package StepDefinitions;

import Pages._001_to_005_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.InputEvent;

public class _003_StepDefinitions {
    _001_to_005_DialogContent dialogContent = new _001_to_005_DialogContent();

    Robot robot;


    @And("The user clicks to calendar")
    public void theUserClicksToCalendar() {
        Tools.Bekle(2);
        dialogContent.myClick(dialogContent.calendar);
    }

    @And("The user clicks to attendance")
    public void theUserClicksToAttendance() {
        Tools.Bekle(2);
        dialogContent.myClick(dialogContent.attendance);
    }

    @And("The user clicks to assignments")
    public void theUserClicksToAssignments() {
        Tools.Bekle(3);
        dialogContent.myClick(dialogContent.assignments);
    }

    @And("The user clicks to grading")
    public void theUserClicksToGrading() {
        Tools.Bekle(2);
        dialogContent.myClick(dialogContent.grading);
    }

    @And("The user clicks to the hamburger menu button")
    public void theUserClicksToTheHamburgerMenuButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.hamburgerMenu);
    }

    @And("The user clicks to the messages button")
    public void theUserClicksToTheMessagesButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.messages);
    }

    @And("The user clicks to the messages close button")
    public void theUserClicksToTheMessagesCloseButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.messagesCloseButton);
    }

    @And("The user clicks to the new messages button")
    public void theUserClicksToTheNewMessagesButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.newMessages);
    }

    @And("The user clicks to the new messages close button")
    public void theUserClicksToTheNewMessagesCloseButton() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.newMessagesCloseButton);
    }

    @And("The user clicks to the profile")
    public void theUserClicksToTheProfile() {
        Tools.Bekle(1);
        dialogContent.myClick(dialogContent.profile);
    }

    @Then("The user should be at the courses page")
    public void theUserShouldBeAtTheCoursesPage() {
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("https://test.mersys.io/student-grading"), "Test Failed");
    }

    @And("The user clicks an empty space")
    public void theUserClicksAnEmptySpace() {
        Tools.Bekle(1);
        try {
            robot = new Robot();
            robot.mouseMove(500, 400);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}
