package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _011_DialogContent extends ParentPage {
    public _011_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
