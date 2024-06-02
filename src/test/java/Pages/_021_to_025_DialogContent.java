package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _021_to_025_DialogContent extends ParentPage {
    public _021_to_025_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"container-3\"]/ms-assignment-panel-student/div/div/div/div[1]/mat-form-field[3]/div[1]/div")
    public WebElement Semester;

    @FindBy(xpath = "//*[@id=\"mat-option-11\"]")
    public WebElement SemesterOption;

    @FindBy(xpath = "//*[@id=\"container-3\"]/ms-assignment-panel-student/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div/div[2]/ms-icon-button[2]")
    public WebElement submit;
}
