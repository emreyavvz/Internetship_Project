package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _016_DialogContent extends ParentPage {
    public _016_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='mat-input-0']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='mat-input-1']")
    public WebElement password;

    @FindBy(xpath = "//span[@class='mdc-button__label']")
    public WebElement login;
    @FindBy(xpath = "(//button[contains(@class, 'mat-mdc-button-wrapper')]//fa-icon)[5]")
    public WebElement grading;
    @FindBy(xpath = "//span[contains(text(),'Student Transcript')]")
    public WebElement Student_Transcript;
    @FindBy(xpath = "//span[contains(text(),'Transcript By Subject')]")
    public WebElement Subject;
    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[4]/button/span[2]/fa-icon")
    public WebElement Assignments;
    @FindBy(xpath = "(//div[contains(@class, 'mdc-tooltip__surface') and contains(@class, 'mdc-tooltip__surface-animation')])")
    public WebElement Assignments_Notification;
    @FindBy(xpath = "//span[normalize-space()='Math Quiz 24']")
    public WebElement MathQuiz;
    @FindBy(xpath = "//mat-select[@id='mat-select-2']")
    public WebElement Status;
    @FindBy(xpath = "//span[@class='mdc-list-item__primary-text']")
    public WebElement Published;
    @FindBy(xpath = "//div[@class='mat-spacer']")
    public WebElement Space;
    @FindBy(xpath = "//mat-select[@id='mat-select-4']")
    public WebElement Semester;
    @FindBy(xpath = "//mat-option[@value='all']")
    public WebElement All;
    @FindBy(xpath = "//*[text()='Math Homework 1']")
    public WebElement MathHomework;
    @FindBy(xpath = "//*[@id=\"container-3\"]/my-assignments-form-page/my-assignments-form/div/div/div/div/div[1]/div[3]/user-chat-bell/button/div/fa-icon")
    public WebElement Discussion;
    @FindBy(xpath = "//fa-icon//*[local-name()='svg' and @data-icon='users']")
    public WebElement Contacts;
    @FindBy(xpath = "//span[text()='Mark Zuckerberg']")
    public WebElement Person;
    @FindBy(xpath = "//textarea[@formcontrolname='commentText']")
    public WebElement Textarea;
    @FindBy(xpath = "//div[@fxlayoutalign='end center']//ms-icon-button[@icon='paper-plane']//button[@mat-icon-button]")
    public WebElement Submit;
    @FindBy(xpath = "//div[contains(@class, 'comment-member-name') and text()=' Me ']")
    public WebElement Me;
    @FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and text()='Print']")
    public WebElement Print;
    @FindBy(xpath = "(//button[@mat-icon-button and @matbadgeoverlap='false' and @matbadgesize='small'])[1]")
    public WebElement Statistics_I;
    @FindBy(xpath = "(//button[@mat-icon-button and @matbadgeoverlap='false' and @matbadgesize='small' and contains(@class, 'mat-mdc-tooltip-trigger')])[2]")
    public WebElement Statistics_Mark;
    @FindBy(xpath = "//*[@id=\"container-3\"]/ms-assignment-panel-student/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div/div[2]/ms-icon-button[2]/button")
    public WebElement Geo_I;
    @FindBy(xpath = "(//button[@mat-icon-button and @matbadgeoverlap='false' and @matbadgesize='small' and contains(@class, 'mat-mdc-tooltip-trigger')])[4]")
    public WebElement Geo_Submit;
    @FindBy(xpath = "(//ms-icon-button[@icon='star' and @color='accent'])[2]")
    public WebElement Geo_Mark;
    @FindBy(xpath = "(//button[@mat-icon-button and contains(@class, 'mdc-icon-button') and contains(@class, 'mat-mdc-icon-button')])[3]")
    public WebElement Back;
    @FindBy(xpath = "//div[contains(@class, 'w-70-p') and text()='11A-Statistics']")//*[text()='11A-Statistics']
    public WebElement Statistics_11A;
    @FindBy(xpath = "///*[text()='Finance']")
    public WebElement Finance;
    @FindBy(xpath = "//*[text()='My Finance']")
    public WebElement MyFinance;
    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/span[1]/span/button")
    public WebElement HamburgerMenu;
    @FindBy(xpath = "//*[@id=ms-table-26]/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr[1]/td[10]/div[1]/ms-standard-button/button/fa-icon")
    public WebElement Student_5;
    @FindBy(xpath = "//*[text()='Fee/Balance Detail']")
    public WebElement FeeBalanceDetail;
    //mat-radio-button[@id='mat-radio-26']//label[contains(text(),'Stripe')]
    @FindBy(xpath = "//*[contains(@class, 'mdc-data-table__content ng-star-inserted')]\n")
    public List<WebElement> TableDetails;
    @FindBy(xpath = "//mat-radio-button[@id='mat-radio-26']//label[contains(text(),'Stripe')]")
    public WebElement Stripe;
    @FindBy(xpath = "//div[@id='card-panel']")
    public WebElement Iframe;
    @FindBy(xpath = "//span[@class='w-50-p discount-class' and contains(text(),'Pay')]")
    public WebElement PayIn;
    @FindBy(xpath = "//input[@id='Field-numberInput']")
    public WebElement CardNumber;
    @FindBy(xpath = "//input[@id='Field-expiryInput']")
    public WebElement Expiration;
    @FindBy(xpath = "//input[@id='Field-cvcInput']")
    public WebElement CvC;
    //input[@id='Field-cvcInput']
    //input[@id='Field-expiryInput']

    //input[@id='Field-numberInput']

    ///Student Payment successfully created
    public WebElement getWebElement(String strElement) {

        switch (strElement) {

            case "TableDetails":
                return (WebElement) this.TableDetails;
            case "CvC":
                return this.CvC;
            case "Expiration":
                return this.Expiration;
            case "CardNumber":
                return this.CardNumber;
            case "PayIn":
                return this.PayIn;
            case "Iframe":
                return this.Iframe;
            case "Stripe":
                return this.Stripe;
            case "Geo_Submit":
                return this.Geo_Submit;
            case "FeeBalanceDetail":
                return this.FeeBalanceDetail;
            case "Student_5":
                return this.Student_5;
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "login":
                return this.login;
            case "grading":
                return this.grading;
            case "Student_Transcript":
                return this.Student_Transcript;
            case "Subject":
                return this.Subject;
            case "Assignments":
                return this.Assignments;
            case "Assignments_Notification":
                return this.Assignments_Notification;
            case "MathQuiz":
                return this.MathQuiz;
            case "Status":
                return this.Status;
            case "Published":
                return this.Published;
            case "Space":
                return this.Space;
            case "Semester":
                return this.Semester;
            case "All":
                return this.All;
            case "MathHomework":
                return this.MathHomework;
            case "Discussion":
                return this.Discussion;
            case "Contacts":
                return this.Contacts;
            case "Person":
                return this.Person;
            case "Textarea":
                return this.Textarea;
            case "Submit":
                return this.Submit;
            case "Me":
                return this.Me;
            case "Print":
                return this.Print;
            case "Statistics_I":
                return this.Statistics_I;
            case "Statistics_Mark":
                return this.Statistics_Mark;
            case "Geo_I":
                return this.Geo_I;
            case "Geo_Mark":
                return this.Geo_Mark;
            case "Back":
                return this.Back;
            case "Statistics_11A":
                return this.Statistics_11A;
            case "Finance":
                return this.Finance;
            case "HamburgerMenu":
                return this.HamburgerMenu;
            case "MyFinance":
                return this.MyFinance;


        }

        return null;

    }
}