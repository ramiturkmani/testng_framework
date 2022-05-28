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

    @FindBy(css = "._8esa")
    public List<WebElement> genderRadioButtons;
}