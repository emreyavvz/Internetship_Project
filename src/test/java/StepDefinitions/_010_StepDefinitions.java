package StepDefinitions;

import Pages.ParentPage;
import Pages._016_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _010_StepDefinitions extends ParentPage {
    _016_DialogContent dc = new _016_DialogContent();
    @Then("the student is redirected to the payment page")
    public void theStudentIsRedirectedToThePaymentPage() {

        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("https://test.mersys.io/student-fees/finance/"), "The student is not redirected to the correct finance page.");
    }

    @Then("the student sees Online Payment and FeeBalance Detail buttons")
    public void theStudentSeesOnlinePaymentAndFeeBalanceDetailButtons() {
        dc.myClick(dc.Stripe);
        Tools.Bekle(3);
    }

    @When("the student selects Stripe and makes a payment")
    public void theStudentSelectsStripeAndMakesAPayment() {
        GWD.getDriver().switchTo().frame(dc.Iframe);
        wait.until(ExpectedConditions.elementToBeSelected(dc.CardNumber));
        dc.mySendKeys(dc.CardNumber,"4242 4242 4242 4242 ");
        dc.mySendKeys(dc.Expiration,"0130");
        dc.mySendKeys(dc.CvC,"433");

        //driver.switchTo().defaultContent();  // otomatik olarak ana sayafa düşersin, en dışa
        //driver.switchTo().parentFrame(); // bir önceki yere dön
    }

    @Then("the balance is updated correctly")
    public void theBalanceIsUpdatedCorrectly() {

    }

    @And("the student sees the successful payment message in the top right message box")
    public void theStudentSeesTheSuccessfulPaymentMessageInTheTopRightMessageBox() {
    }



}
