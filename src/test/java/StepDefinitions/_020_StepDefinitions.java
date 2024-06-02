package StepDefinitions;

import Pages.ParentPage;
import Pages._016_DialogContent;
import Utilities.Tools;
import io.cucumber.java.en.*;
import org.testng.Assert;
import java.awt.*;
import java.awt.event.KeyEvent;


public class _020_StepDefinitions extends ParentPage {
    _016_DialogContent dc = new _016_DialogContent();
    Robot robot = new Robot();

    public _020_StepDefinitions() throws AWTException {
    }

    @Then("the Information, Submit, and Mark it icons work")
    public void theInformationSubmitAndMarkItIconsWork() {
        Tools.Bekle(1);
        dc.myClick(dc.Geo_Mark);
        dc.myClick(dc.Geo_Submit);
        Tools.Bekle(2);
        dc.myClick(dc.Back);
    }

    @When("the student clicks outside icons on an assignment")
    public void theStudentClicksOutsideIconsOnAnAssignment() {
        dc.myClick(dc.MathHomework);
    }

    @Then("the student sees assignment details")
    public void theStudentSeesAssignmentDetails() {
        Assert.assertTrue(dc.MathHomework.isDisplayed(), "MathHomework Details is not visible");
    }

    @Given("the student opened a discussion")
    public void theStudentOpenedADiscussion() {
        for (int i = 0; i < 1; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Tools.Bekle(1);
        for (int i = 0; i < 7; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);

        }

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);


    }

    @Then("the Discussion icon is visible")
    public void theDiscussionIconIsVisible() {

        Assert.assertTrue(dc.Discussion.isDisplayed(), "Discussion Icon not visible");

    }
}
