package StepDefinitions;
import Pages.ParentPage;
import Pages._016_DialogContent;
import Utilities.Tools;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.awt.*;
import java.awt.event.KeyEvent;

public class _019_StepDefinitions extends ParentPage {
    _016_DialogContent dc = new _016_DialogContent();
    Robot robot = new Robot();

    public _019_StepDefinitions() throws AWTException {
    }

    @Given("the student clicks the assignments link")
    public void theStudentIsOnTheAssignmentsPage() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.Assignments));
        dc.myClick(dc.Assignments);
    }

    @When("the student clicks a random assignment")
    public void theStudentClicksARandomAssignment() {
        Tools.Bekle(1);
        dc.myClick(dc.Space);
        Tools.Bekle(2);
        dc.myClick(dc.Semester);
        dc.myClick(dc.All);
        Tools.Bekle(1);
        dc.myClick(dc.MathHomework);
        Tools.Bekle(1);
    }

    @And("the student clicks the Discussion button")
    public void theStudentClicksTheDiscussionButton() {

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
        Tools.Bekle(3);
    }
    @Then("the student attaches files")
    public void theStudentAttachesFiles() {
        String filePath = "deneme";
        for (char c : filePath.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (KeyEvent.CHAR_UNDEFINED == keyCode) {
                throw new RuntimeException(
                        "Character key code not found: '" + c + "'");
            }
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
        }
    }
    @When("the student sends a message")
    public void theStudentSendsAMessage() {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        dc.mySendKeys(dc.Textarea,"How do you think about this math homework?");

        Tools.Bekle(2);
        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        dc.myClick(dc.Submit);
    }

    @Then("message sent successfully alert appears")
    public void AlertAppears() {
        boolean isMeVisible = wait.until(ExpectedConditions.visibilityOf(dc.Me)).isDisplayed();
        if (isMeVisible) {
            System.out.println("Message Sent.");
        } else {
            System.out.println("Message Not Sent.");
        }
    }

}
