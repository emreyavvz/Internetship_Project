package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class _002_DialogContent extends ParentPage {

    public _002_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "username":


        }

        return null;
    }


}
