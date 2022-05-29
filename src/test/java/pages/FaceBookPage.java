package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FaceBookPage {
    public FaceBookPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[id^='u_0_2_']")
    public WebElement createNewAccountLink;

    //Sign in form elements
    @FindBy(css = "input[name='firstname']")
    public WebElement firstNameInputBox;

    @FindBy(css = "input[name='lastname']")
    public WebElement lastNameInputBox;

    @FindBy(css = "input[name='reg_email__']")
    public WebElement emailOrPhoneInputBox;

    @FindBy(css = "input[name='reg_email_confirmation__']")
    public WebElement emailReEnterInputBox;

    @FindBy(css = "input[name='reg_passwd__']")
    public WebElement passwordInputBox;

    @FindBy(id = "month")
    public WebElement monthDropdown;

    @FindBy(id = "day")
    public WebElement dayDropdown;

    @FindBy(id = "year")
    public WebElement yearDropdown;

    @FindBy(css = "._8esa")
    public List<WebElement> genderRadioButtons;

    @FindBy(css = "button[name='websubmit']")
    public WebElement signUpButton;

    @FindBy(id = "reg_error_inner")
    public WebElement errorMessage;
}