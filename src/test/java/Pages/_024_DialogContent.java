package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _024_DialogContent extends ParentPage {
    public _024_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
