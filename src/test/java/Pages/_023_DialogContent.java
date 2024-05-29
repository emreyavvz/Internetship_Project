package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _023_DialogContent extends ParentPage {
    public _023_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
