package StepDefinitions;

import Pages._016_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _016_StepDefinitions {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));


    _016_DialogContent dc = new _016_DialogContent();


    @Given("the student is on the grading page")
    public void theStudentIsOnTheGradingPage() {
        Tools.Bekle(2);
        dc.myClick(dc.grading);
        Assert.assertTrue(dc.grading.isDisplayed(), "Grading link is not visible");

    }

    @When("the student clicks the Course Grade button")
    public void theStudentClicksTheCourseGradeButton() {

        dc.myClick(dc.grading);
    }

    @Then("the student sees the course grades")
    public void theStudentSeesTheCourseGrades() {

        wait.until(ExpectedConditions.visibilityOf(dc.grading));

        Assert.assertTrue(dc.grading.isDisplayed(), "Grading link is not visible");

    }

    @When("the student clicks the Student Transcript button")
    public void theStudentClicksTheStudentTranscriptButton() {
        dc.myClick(dc.Student_Transcript);
    }

    @Then("the student sees the student transcript")
    public void theStudentSeesTheStudentTranscript() {

        wait.until(ExpectedConditions.visibilityOf(dc.Student_Transcript));

        Assert.assertTrue(dc.Student_Transcript.isDisplayed(), "Student transcript is not visible");
    }

    @When("the student clicks the Transcript By Subject button")
    public void theStudentClicksTheTranscriptBySubjectButton() {
        dc.myClick(dc.Subject);
    }

    @Then("the student sees the transcript by subject")
    public void theStudentSeesTheTranscriptBySubject() {

        wait.until(ExpectedConditions.visibilityOf(dc.Subject));

        Assert.assertTrue(dc.Subject.isDisplayed(), "Transcript By Subject is not visible");

    }

}
