package StepDefinitions;

import Pages.ParentPage;
import Pages._016_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _018_StepDefinitions extends ParentPage {
    _016_DialogContent dc = new _016_DialogContent();

    @Given("the student is on the home page")
    public void theStudentIsOnTheHomePage() {
        GWD.getDriver().get("https://test.mersys.io");
        dc.mySendKeys(dc.username, "Student_5");
        dc.mySendKeys(dc.password, "S12345");
        dc.myClick(dc.login);
    }


    @When("the student hovers over the assignments link")
    public void theStudentHoversOverTheAssignmentsLink() {
        // Actions actions = new Actions(driver);
        // actions.moveToElement(element.Assignments).perform();
        // Assert.assertTrue(element.Assignments_Notification.isDisplayed(), "Bildirim görüntülenemedi!");
        // dc.Assignments.click();
        Tools.Bekle(3);
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(dc.Assignments).perform();
        Assert.assertTrue(dc.Assignments_Notification.isDisplayed(), "Notification could not be displayed!");
    }

    @Then("the student should see the total number of assignments")
    public void theStudentShouldSeeTheTotalNumberOfAssignments() {
        Assert.assertTrue(dc.Assignments_Notification.isDisplayed(), "Notification could not be displayed!");
    }

    @When("the student is on the assignments page")
    public void theStudentClicksTheAssignmentsLink() {
        dc.myClick(dc.Assignments);
        dc.myClick(dc.Semester);
        dc.myClick(dc.All);
        Tools.Bekle(1);

    }

    @Then("the student should see all assignments")
    public void theStudentShouldSeeAllAssignments() {
        boolean isMeVisible = wait.until(ExpectedConditions.visibilityOf(dc.Assignments)).isDisplayed();
        if (isMeVisible) {
            System.out.println("assignments viewed.");
        } else {
            System.out.println("assignments could not be displayed.");
        }

    }
}
