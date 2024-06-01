package StepDefinitions;

import Pages.ParentPage;
import Pages._011_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class _013_StepDefinitions extends ParentPage {
  _011_DialogContent dc = new _011_DialogContent();
    Robot robot = new Robot();

    public _013_StepDefinitions() throws AWTException {
    }

    @And("Attendence Execuses Click with Robot")
    public void attendenceExecusesClickWithRobot() {
        for (int i = 0; i < 7; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Tools.Bekle(2);
    }

    @And("Click on the Element in Dialogs")
    public void clickOnTheElementInDialog(DataTable butonlar) {
        Tools.Bekle(2);
        List<String> strButtonList = butonlar.asList(String.class);
      //  Tools.Bekle(2);
        for (int i = 0; i < strButtonList.size(); i++) {
            //System.out.println(strLinkList.get(i));
            WebElement linkWebElemnt = dc.getWebElement(strButtonList.get(i));
            dc.myClick(linkWebElemnt);
            Tools.Bekle(2);

        }
    }

    @And("Rollover to Excuses")
    public void rolloverToExcuses() {
       Tools.Bekle(5);
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("window.scrollTo(0,0)");
    }
}
