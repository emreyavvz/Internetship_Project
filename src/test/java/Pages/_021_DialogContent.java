package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _021_DialogContent extends ParentPage {
    public _021_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
