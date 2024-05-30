package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _001_to_005_DialogContent extends ParentPage {

    public _001_to_005_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='mat-input-0']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='mat-input-1']")
    public WebElement password;

    @FindBy(xpath = "//span[@class='mdc-button__label']")
    public WebElement login;

    @FindBy(xpath = "//div[@fxlayout='row']//div[@class='ng-star-inserted']//img")
    public WebElement logo;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[2]/button")
    public WebElement calendar;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[3]/button")
    public WebElement attendance;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[4]/button")
    public WebElement assignments;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[5]/button")
    public WebElement grading;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/span[1]/span/button")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/user-chat-bell/button")
    public WebElement messages;

    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement messagesCloseButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/user-message-bell/button")
    public WebElement newMessages;

    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement newMessagesCloseButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/button")
    public WebElement profile;

    @FindBy(xpath = "//*[@id='mat-menu-panel-4']/div/button[1]")
    public WebElement messaging;

    @FindBy(xpath = "//*[@id='mat-menu-panel-5']/div/button[1]")
    public WebElement newMessage;

    @FindBy(xpath = "//*[@id='mat-menu-panel-5']/div/button[2]")
    public WebElement inbox;

    @FindBy(xpath = "//*[@id='mat-menu-panel-5']/div/button[3]")
    public WebElement outbox;

    @FindBy(xpath = "//*[@id='mat-menu-panel-5']/div/button[4]")
    public WebElement trash;

    @FindBy(css = "#\\32  > div > div > subscribers-dialog > ms-dialog > ms-dialog-buttons > mat-dialog-actions > ms-button:nth-child(1) > button")
    public WebElement add;

    @FindBy(xpath = "//*[@id=\"mat-mdc-checkbox-23\"]")
    public WebElement teacher1;

    @FindBy(css = "#\\32  > div > div > subscribers-dialog > ms-dialog > ms-dialog-buttons > mat-dialog-actions > ms-button:nth-child(2) > button")
    public WebElement addAndExit;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    public WebElement subjectTextField;

    @FindBy(xpath = "//*[@id=\"tinymce\"]")
    public WebElement messageTextField;

    @FindBy(xpath = "//*[@id=\"container-3\"]/app-user-message-form/mat-card/div/div[3]/file-upload/div/div[2]/ms-button/button")
    public WebElement attachFiles;

    @FindBy(xpath = "//*[@id=\"mat-menu-panel-19\"]/div/ms-standard-button[1]/button")
    public WebElement fromLocalButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/footer/user-message-buttons/button-bar/div/div[1]/ms-button[2]/button")
    public WebElement sendButton;

    @FindBy(xpath = "//div[contains(text(),'Message Successfully sent')]")
    public WebElement successMessage;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "login":
                return this.login;
            case "logo":
                return this.logo;
            case "calendar":
                return this.calendar;
            case "attendance":
                return this.attendance;
            case "assignments":
                return this.assignments;
            case "grading":
                return this.grading;
            case "hamburgerMenu":
                return this.hamburgerMenu;
            case "messages":
                return this.messages;
            case "messagesCloseButton":
                return this.messagesCloseButton;
            case "newMessages":
                return this.newMessages;
            case "newMessagesCloseButton":
                return this.newMessagesCloseButton;
            case "profile":
                return this.profile;
            case "messaging":
                return this.messaging;
            case "newMessage":
                return this.newMessage;
            case "inbox":
                return this.inbox;
            case "outbox":
                return this.outbox;
            case "trash":
                return this.trash;
            case "add":
                return this.add;
            case "teacher1":
                return this.teacher1;
            case "addAndExit":
                return this.addAndExit;
            case "subjectTextField":
                return this.subjectTextField;
            case "messageTextField":
                return this.messageTextField;
            case "attachFiles":
                return this.attachFiles;
            case "fromLocalButton":
                return this.fromLocalButton;
            case "sendButton":
                return this.sendButton;
            case "successMessage":
                return this.successMessage;
            default:
                System.out.println("Element not found");
                return null;
        }
    }
}
