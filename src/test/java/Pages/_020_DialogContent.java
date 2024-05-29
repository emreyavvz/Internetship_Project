package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _020_DialogContent extends ParentPage {
    public _020_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
