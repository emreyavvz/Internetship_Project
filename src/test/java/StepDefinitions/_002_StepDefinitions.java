package StepDefinitions;

import Pages._001_to_005_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Set;

public class _002_StepDefinitions {

    _001_to_005_DialogContent dialogContent = new _001_to_005_DialogContent();

    @And("The user clicks to the Home Logo")
    public void theUserClicksToTheHomeLogo() {
        dialogContent.myClick(dialogContent.logo);

    }

    @Then("The user should be redirected to the Techno Study page")
    public void theUserShouldBeRedirectedToTheTechnoStudyPage() {
        Tools.Bekle(3);
        String firstTabHandle = GWD.getDriver().getWindowHandle(); // firstTabHandle = https://test.mersys.io/user-courses

        Set<String> allHandles = GWD.getDriver().getWindowHandles();

        for (String handle : allHandles) {
            if (!handle.equals(firstTabHandle)) { // tab'daki site ilkine eşit değilse
                GWD.getDriver().switchTo().window(handle); // driver'ın window'unu değiştir
                break;
            }
        }

        String newTabURL = GWD.getDriver().getCurrentUrl(); // driver window'unu değiştirdikten sonra
        System.out.println("URL of the new tab: " + newTabURL);

        Assert.assertTrue(newTabURL.contains("https://techno.study/"), "Test Failed");
    }
}
