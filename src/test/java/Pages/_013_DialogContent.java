package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _013_DialogContent extends ParentPage {
    public _013_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
