package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _012_DialogContent extends ParentPage {
    public _012_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
