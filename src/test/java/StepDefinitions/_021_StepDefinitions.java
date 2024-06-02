package StepDefinitions;

import Pages._021_to_025_DialogContent;
import Utilities.Tools;
import io.cucumber.java.en.And;

public class _021_StepDefinitions {
    _021_to_025_DialogContent dc = new _021_to_025_DialogContent();

    @And("The user clicks on Semester tab")
    public void theUserClicksOnSemesterTab() {
        Tools.Bekle(1);
        dc.myClick(dc.Semester);
    }

    @And("The user clicks on all")
    public void theUserClicksOnAll() {
        Tools.Bekle(2);
        dc.myClick(dc.SemesterOption);
    }

    @And("The user clicks on submit button")
    public void theUserClicksOnSubmitButton() {
        Tools.Bekle(2);
        dc.myClick(dc.submit);
    }
}
