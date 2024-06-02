package StepDefinitions;

import Pages.ParentPage;
import Pages._016_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.tools.Tool;
import java.awt.*;
import java.awt.event.KeyEvent;

public class _017_StepDefinitions extends ParentPage {

    _016_DialogContent dc = new _016_DialogContent();

    public _017_StepDefinitions() throws AWTException {

    }
    Robot robot = new Robot();
    @Given("the student is logged into the system")
    public void theStudentIsLoggedIntoTheSystem() {
        GWD.getDriver().get("https://test.mersys.io");
        dc.mySendKeys(dc.username, "Student_5");
        dc.mySendKeys(dc.password, "S12345");
        dc.myClick(dc.login);
    }

    @When("the student navigates to the Course Grade or Students Transcript page")
    public void theStudentNavigatesToTheCourseGradeOrStudentsTranscriptPage() {
        Tools.Bekle(3);
        dc.myClick(dc.Student_Transcript);


        WebElement studentTranscriptElement = dc.Student_Transcript;
        boolean isStudentTranscriptVisible = wait.until(ExpectedConditions.visibilityOf(studentTranscriptElement)).isDisplayed();
        if (isStudentTranscriptVisible) {
            System.out.println("Student Transcript Göründü");
        } else {
            System.out.println("Student Transcript Görünmedi");
        }

    }


    @When("the student clicks the Print icon")
    public void theStudentClicksThePrintIcon() throws AWTException {
        dc.myClick(dc.Print);
        Tools.Bekle(3);
    }
    @When("the student clicks the Download button")
    public void theStudentClicksTheDownloadButton() throws AWTException {

        for (int i = 0; i < 8; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Tools.Bekle(2);



    }

    @Then("the PDF document should be downloaded to the student's local computer")
    public void thePDFDocumentShouldBeDownloadedToTheStudentSLocalComputer() {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }

}
