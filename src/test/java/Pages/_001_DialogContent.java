package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _001_DialogContent extends ParentPage {

    public _001_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "username":
        }
        return null;
    }
}
