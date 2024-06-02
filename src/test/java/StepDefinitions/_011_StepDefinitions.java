package StepDefinitions;

import Pages.ParentPage;
import Pages._010_DialogContent;
import Pages._011_DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class _011_StepDefinitions extends ParentPage {
    _011_DialogContent dc = new _011_DialogContent();


    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable butonlar) {
        List<String> strButtonList = butonlar.asList(String.class);

        for (int i = 0; i < strButtonList.size(); i++) {
            //System.out.println(strLinkList.get(i));
            WebElement linkWebElemnt = dc.getWebElement(strButtonList.get(i));
            dc.myClick(linkWebElemnt);
            Tools.Bekle(3);

        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable textBoxVeYazilar) {
        List<List<String>> listTxtYazi = textBoxVeYazilar.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElemnt = dc.getWebElement(listTxtYazi.get(i).get(0));
            dc.mySendKeys(txtBoxWebElemnt, listTxtYazi.get(i).get(1));
            Tools.Bekle(1);
        }
    }


    @Then("Payment Success Massege")
    public void paymenSuccessMassege() {
        Tools.Bekle(1);
//        Assert.assertTrue(dc.SuccessMsg.isDisplayed());
//        System.out.println("elements.SuccessMsg.getText() = " + dc.SuccessMsg.getText());
        dc.verifyContainsText(dc.SuccessMsg,"Student Payment successfully created");
    }


    @And("User sending the keys in Dialogs")
    public void userSendingTheKeysInDialogs(DataTable textBoxVeYazilar) {

        List<List<String>> listTxtYazi = textBoxVeYazilar.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElemnt = dc.getWebElement(listTxtYazi.get(i).get(0));
            dc.mySendKeys(txtBoxWebElemnt, listTxtYazi.get(i).get(1));
        }
    }

    @Then("the user switches to the iframe")
    public void theUserSwitchesToTheIframe(DataTable index) {
        List<List<String>> listTxtYazi = index.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            int iframeIndex = Integer.parseInt(listTxtYazi.get(i).get(0));
            driver.switchTo().frame(iframeIndex);
            Tools.Bekle(1); // Eğer Tools sınıfınız yoksa bu satırı kaldırın veya başka bir bekleme yöntemi kullanın
            // İçeride yapılacak işlemler burada olabilir
            // Bu örnekte iframe'e geçiş yapıldıktan sonra tekrar ana içeriğe dönülüyor

        }
    }

//    @And("Card information sending")
//    public void cardInformationSending() {
//        Tools.Bekle(4);
//        driver.switchTo().frame(0);
//        mySendKeys(dc.CardNumber,"4242424242424242");
//        mySendKeys(dc.ExpDate,"1225");
//        mySendKeys(dc.Ccv,"123");
//
//        driver.switchTo().defaultContent();
//        dc.StripePay.click();
//        driver.switchTo().defaultContent();
//        Tools2.Bekle(2);
//        elements.Balance.click();

//        for (WebElement p: elements.paymentsList){
//            if (p.getText().contains("235")){
//                System.out.println("success");
//            }else System.out.println("fail");
//        }
//        for(WebElement a : elements.payFull)
//            System.out.println("a.getText() = " + a.getText());
//        Tools.Bekle(3);
//        Assert.assertTrue(dc.SuccessMsg.isDisplayed());
//        System.out.println("elements.SuccessMsg.getText() = " + dc.SuccessMsg.getText());
//
//    }

    @When("the user switches to the iframe with index {int}")
    public void theUserSwitchesToTheIframeWithIndex(int index) {
        GWD.getDriver().switchTo().frame(index);
    }

    @And("User back to Recent Page")
    public void userBackToRecentPage() {
        GWD.getDriver().switchTo().defaultContent();
    }
}