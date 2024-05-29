package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _022_DialogContent extends ParentPage {
    public _022_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
