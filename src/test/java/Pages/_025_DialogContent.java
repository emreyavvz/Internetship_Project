package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _025_DialogContent extends ParentPage {
    public _025_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
