package StepDefinitions;

import Pages.ParentPage;
import Pages._011_DialogContent;
import Pages._012_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

public class _012_StepDefinitions extends ParentPage {
    _011_DialogContent dc = new _011_DialogContent();
    WebDriver driver;
    WebDriverWait wait;

    @When("Download Document")
    public void the_user_performs_Test12_action() throws AWTException {

//
//        // Senaryo adımları
//
//        dc.myClick(dc.HamburgerMenu);
//
//
//        dc.myClick(dc.Finance);
//        dc.myClick(dc.MyFinance);
//        Tools.Bekle(2);
//        //wait.until(ExpectedConditions.elementToBeClickable(dc.StudentColumn));
//        dc.myClick(dc.SelectMenu);
//
//        dc.myClick(dc.pdfDoc);

        // Yeni pencereye geçiş
        String originalWindow = GWD.getDriver().getWindowHandle();
        Set<String> allWindows = GWD.getDriver().getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                GWD.getDriver().switchTo().window(windowHandle);
            }
        }

        // Bekleme
        Tools.Bekle(2);

        // Robot işlemleri
        Robot robot = new Robot();
        for (int i = 0; i < 8; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}




