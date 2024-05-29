package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _014_DialogContent extends ParentPage {
    public _014_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
