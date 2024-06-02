package StepDefinitions;

import Pages.ParentPage;
import Pages._016_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class _009_StepDefinitions extends ParentPage {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));


    _016_DialogContent dc = new _016_DialogContent();

    @Given("the student is on the homepage")
    public void theStudentIsOnTheHomepage() {
        GWD.getDriver().get("https://test.mersys.io");
        dc.mySendKeys(dc.username, "Student_5");
        dc.mySendKeys(dc.password, "S12345");
        dc.myClick(dc.login);
    }

    @When("the student clicks the Finance link in the Hamburger menu")
    public void theStudentClicksTheFinanceLinkInTheHamburgerMenu() {
        Actions actions = new Actions(GWD.getDriver());

        // Hamburger menüsüne tıklama
        wait.until(ExpectedConditions.elementToBeClickable(dc.HamburgerMenu));
        dc.myClick(dc.HamburgerMenu);
Tools.Bekle(2);
        // Finance seçeneğine tıklama
       // wait.until(ExpectedConditions.elementToBeSelected(dc.Finance));
        actions.moveToElement(dc.Finance).click().perform();

        // MyFinance seçeneğine tıklama
        wait.until(ExpectedConditions.visibilityOf(dc.MyFinance));
        dc.myClick(dc.MyFinance);
        Tools.Bekle(2);
    }

    @Then("the student is redirected to the finance page")
    public void theStudentIsRedirectedToTheFinancePage() {
        //wait.until(ExpectedConditions.visibilityOf(dc.Finance));
        // Assert.assertTrue(dc.Finance.isDisplayed(), "Finance link is not visible");
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), "https://test.mersys.io/student-finance/active", "The student is not redirected to the correct finance page.");


    }

    @When("the student clicks on the row with their name on the finance page")
    public void theStudentClicksOnTheRowWithTheirNameOnTheFinancePage() throws AWTException {
        // dc.myClick(dc.Student_5);
        Robot robot = new Robot();

        for (int i = 0; i < 19; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    @Then("the student sees the FeeBalance Detail button on the finance page")
    public void theStudentSeesTheFeeBalanceDetailButtonOnTheFinancePage() {
        wait.until(ExpectedConditions.visibilityOf(dc.FeeBalanceDetail));
        Assert.assertTrue(dc.FeeBalanceDetail.isDisplayed(), "FeeBalance Detail button is not visible on the finance page");
    }

    @When("the student clicks the FeeBalance Detail button")
    public void theStudentClicksTheFeeBalanceDetailButton() {
        dc.myClick(dc.FeeBalanceDetail);
    }

    @Then("the student sees the installment plan table")
    public void
    theStudentSeesTheInstallmentPlanTable() {
        Tools.Bekle(2);
        Assert.assertTrue(dc.TableDetails.size() > 0, "Installment plan table is not visible or has no rows.");
        for (WebElement row : dc.TableDetails) {
            List<WebElement> cells = row.findElements(By.tagName("td")); // Her bir satırdaki "td" tag'ine sahip elemanları bulur
            if (cells.size() > 0) { // Başlık satırlarını atlamak için kontrol
                StringBuilder rowText = new StringBuilder();
                for (WebElement cell : cells) {
                    rowText.append(cell.getText()).append(" | "); // Her bir hücreyi StringBuilder'a ekler
                }
                System.out.println(rowText.toString().trim()); // StringBuilder'ı String'e çevirip yazdırır ve satır sonundaki fazladan boşluğu/separator'ü kaldırır
            }
        }


    }
}
