package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _015_DialogContent extends ParentPage {
    public _015_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
