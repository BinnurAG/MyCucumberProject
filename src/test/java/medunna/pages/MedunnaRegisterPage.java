package medunna.pages;

import medunna.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedunnaRegisterPage {

    public MedunnaRegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(xpath = "//a[@href='/account/register']")
    public WebElement register;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "firstPassword")
    public WebElement firstPassword;

    @FindBy(id = "strength")
    public WebElement strength;

    @FindBy(id = "secondPassword")
    public WebElement secondPassword;

    @FindBy(id = "register-submit")
    public WebElement registerSubmit;

    @FindBy(linkText = "Your SSN is required.")
    public WebElement ssnWarning;

    @FindBy(linkText = "Your FirstName is required.")
    public WebElement firstNameWarning;

    @FindBy(linkText = "Your LastName is required.")
    public WebElement lastNameWarning;

    @FindBy(linkText = "Your username is required.")
    public WebElement userNameWarning;

    @FindBy(linkText = "Your email is required.")
    public WebElement emailWarning;

    @FindBy(linkText = "Your password is required.")
    public WebElement passwordWarning;

    @FindBy(linkText = "Your confirmation password is required.")
    public WebElement confirmationWarning;


}
