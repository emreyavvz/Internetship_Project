package StepDefinitions;

import Pages._011_DialogContent;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _014_StepDefinitions {
    _011_DialogContent dc = new _011_DialogContent();
    Robot robot = new Robot();

    public _014_StepDefinitions() throws AWTException {
    }

    @And("Upoad The Picture")
    public void upoadThePicture() {
        StringSelection dosyaYolu= new StringSelection("C:\\Users\\gence\\r.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        Tools.Bekle(2);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Tools.Bekle(10);

        Assert.assertTrue(dc.imageByte.isDisplayed());

        dc.myClick(dc.uploadimage);
        Tools.Bekle(5);

        dc.myClick(dc.Saveimage);


        Assert.assertTrue(dc.SuccessUpdate.isDisplayed());
    }

    @Then("Success Massege")
    public void successMassege() {
        dc.verifyContainsText(dc.SuccessUpdate,"Profile successfully updated");
    }

}
