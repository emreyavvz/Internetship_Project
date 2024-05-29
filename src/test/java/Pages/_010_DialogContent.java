package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _010_DialogContent extends ParentPage {
    public _010_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
