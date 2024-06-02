package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _006_to_007_DialogContent extends ParentPage {

    public _006_to_007_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    public WebElement username;
    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    public WebElement password;
    @FindBy(xpath = "//span[@class='mdc-button__label']")
    public WebElement login;
    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/span[1]/span/button")
    public WebElement hamburgerMenu;
    @FindBy(xpath = "//*[@id='mat-menu-panel-4']/div/button[1]")
    public WebElement messaging;
    @FindBy(xpath = "//*[@id='mat-menu-panel-5']/div/button[3]")
    public WebElement outbox;
    @FindBy(xpath = "//*[@id='mat-menu-panel-5']/div/button[4]")
    public WebElement trash;
    @FindBy(xpath = "//*[@id=\"ms-table-0\"]/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr[1]/td[6]/div[1]/ms-confirm-button/button")
    public WebElement deleteMessage;
    @FindBy(xpath = "//*[@id=\"2\"]/div/div/app-simple-dialog/mat-dialog-actions/div/div/button[2]")
    public WebElement confirmDelete;
    @FindBy(xpath = "//div[contains(text(),'Message successfully moved to trash!')]")
    public WebElement deletedMessage;

    @FindBy(xpath = "//*[@id=\"ms-table-0\"]/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr[1]/td[7]/div[1]/ms-standard-button[2]/button")
    public WebElement restoreIcon;

    @FindBy(xpath = "//div[contains(text(),'Message successfully restored from trash')]")
    public WebElement restoredMessage;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "username":
                return username;
            case "password":
                return password;
            case "login":
                return login;
            case "hamburgerMenu":
                return hamburgerMenu;
            case "messaging":
                return messaging;
            case "outbox":
                return outbox;
            case "trash":
                return trash;
            case "deleteMessage":
                return deleteMessage;
            case "confirmDelete":
                return confirmDelete;
            case "deletedMessage":
                return deletedMessage;
            default:
                return null;
        }
    }
}
