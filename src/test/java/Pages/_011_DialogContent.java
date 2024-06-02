package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _011_DialogContent extends ParentPage {
    public _011_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    public static WebDriver driver = null;
    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/span[1]/span/button")
    public WebElement HamburgerMenu;

    @FindBy(xpath = "//span[text()='Finance']")
    public WebElement Finance;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement MyFinance;

    @FindBy(xpath = "//span[text()=' Student_5 11A']")
    public WebElement StudentColumn;

    @FindBy(xpath = "//*[text()='Stripe ']")
    public WebElement Stripe;

    @FindBy(xpath = "//*[contains(text(), 'Pay in full')]")
    public WebElement AmountDebt;

    @FindBy(xpath = "(//*[text()='Pay'])[1]")
    public WebElement PayCustom;

    @FindBy(xpath = "(//*[text()='Pay'])[2]")
    public WebElement PayButton;

    @FindBy(xpath = "//*[@placeholder=\"1234 1234 1234 1234\"]")
    public WebElement CardNumber;

    @FindBy(xpath = "//*[@id=\"Field-expiryInput\"]")
    public WebElement ExpDate;

    @FindBy(xpath = "//*[@id=\"Field-cvcInput\"]")
    public WebElement Ccv;

    @FindBy(xpath = "//*[@id=\"payment-form\"]/button")
    public WebElement StripePay;

    @FindBy(xpath = "//input[@id=\"ms-currency-field-0\"]")
    public WebElement InputAmount;

    @FindBy(xpath = "//*[@id=\"mat-tab-label-0-1\"]")
    public WebElement Balance;

    @FindBy(xpath = "//*[@role=\"row\"]")
    public List<WebElement> paymentsList;

    @FindBy(xpath = "//*[text()='Student Payment successfully created']")
    public WebElement SuccessMsg;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[22]")
    public WebElement SelectMenu;

    @FindBy(xpath = "//*[text()=' Pdf Export ']")
    public WebElement pdfDoc;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[3]")
    public WebElement Attendance;

    @FindBy(xpath = "//*[text()=' ATTENDANCE EXCUSES ']")
    public WebElement Excuses;

    @FindBy(xpath = "//*[@id=\"ms-table-4_buttons\"]/ms-table-toolbar/div/ms-add-button/button/span[2]")
    public WebElement AddButton;

    @FindBy(xpath = "//*[@placeholder=\"Message\"]")
    public WebElement excuseswrite;

    @FindBy(xpath = "//*[@id=\"6\"]/div/div/parent-excuse-dialog/ms-dialog/simple-dialog-title/mat-toolbar/mat-toolbar-row/div/button[1]")
    public WebElement attachfile;

    @FindBy(xpath = "//span[text()='From Local']")
    public WebElement fromlocalbutton;

    @FindBy(xpath = "//*[@id=\"3\"]/div/div/parent-excuse-dialog/ms-dialog/ms-dialog-buttons/mat-dialog-actions/ms-button/button")
    public WebElement sendButton;

    @FindBy(xpath = "(//button[@aria-haspopup=\"menu\"])[2]")
    public WebElement StudentSettings;

    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement Settings;

    @FindBy(xpath = "//*[@class=\"profile-image avatar huge ng-star-inserted\"]")
    public WebElement image;

    @FindBy(xpath = "//button[@class=\"mat-mdc-tooltip-trigger mdc-fab mdc-fab--mini mat-mdc-mini-fab mat-accent mat-mdc-button-base\"]")
    public WebElement upload;

    @FindBy(xpath = "//*[@class=\"mat-file-upload ng-star-inserted\"]")
    public WebElement imageByte;

    @FindBy(xpath = "//*[text()='Profile successfully updated']")
    public WebElement SuccessUpdate;

    @FindBy(xpath = "//*[text()=' Upload ']")
    public WebElement uploadimage;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement Saveimage;

    @FindBy(xpath = "//*[@formcontrolname=\"theme\"]")
    public WebElement ThemeMenu;

    @FindBy(xpath = "//span[text()=' Purple Theme ']")
    public WebElement purpleTheme;

    @FindBy(xpath = "//span[text()=' Dark Purple Theme ']")
    public WebElement darkPurpleTheme;

    @FindBy(xpath = "//div[@role=\"listbox\"]")
    public List<WebElement> Themes;

    @FindBy(xpath = "//*[@class=\"mat-toolbar-row\"]")
    public WebElement toolbar;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement savebuttonColor;
    @FindBy(xpath = "//*[@id='mat-input-0']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='mat-input-1']")
    public WebElement password;

    @FindBy(xpath = "//span[@class='mdc-button__label']")
    public WebElement login;

    @FindBy(xpath = "//*[@id=\"payment-element\"]/div/iframe")
    public WebElement iframe;



    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "login":
                return this.login;
            case "HamburgerMenu":
                return this.HamburgerMenu;
            case "Finance":
                return this.Finance;
            case "MyFinance":
                return this.MyFinance;
            case "StudentColumn":
                return this.StudentColumn;
            case "Stripe":
                return this.Stripe;
            case "AmountDebt":
                return this.AmountDebt;
            case "PayCustom":
                return this.PayCustom;
            case "PayButton":
                return this.PayButton;
            case "CardNumber":
                return this.CardNumber;
            case "ExpDate":
                return this.ExpDate;
            case "Ccv":
                return this.Ccv;
            case "StripePay":
                return this.StripePay;
            case "InputAmount":
                return this.InputAmount;
            case "Balance":
                return this.Balance;
            case "StudentSettings":
                return this.StudentSettings;
            case "Settings":
                return this.Settings;
            case "image":
                return this.image;
            case "upload":
                return this.upload;
            case "imageByte":
                return this.imageByte;
            case "SuccessUpdate":
                return this.SuccessUpdate;
            case "uploadimage":
                return this.uploadimage;
            case "Saveimage":
                return this.Saveimage;
            case "ThemeMenu":
                return this.ThemeMenu;
            case "sendButton":
                return this.sendButton;
            case "purpleTheme":
                return this.purpleTheme;
            case "darkPurpleTheme":
                return  this.darkPurpleTheme;
            case "Themes":
                return (WebElement) this.Themes;
            case "toolbar":
                return this.toolbar;
            case "savebuttonColor":
                return this.savebuttonColor;
            case "paymentsList":
                return (WebElement) this.paymentsList;
            case"SuccessMsg":
                return this.SuccessMsg;
            case "SelectMenu":
                return this.SelectMenu;
            case "pdfDoc":
                return this.pdfDoc;
            case "Attendance":
                return this.Attendance;
            case "Excuses":
                return this.Excuses;
            case "AddButton":
                return this.AddButton;
            case "excuseswrite":
                return  this.excuseswrite;
            case "attachfile":
                return this.attachfile;
            case"fromlocalbutton":
                return this.fromlocalbutton;
            case "iframe":
                return this.iframe;



            default:
                System.out.println("Element not found");
                return null;
        }
    }
}