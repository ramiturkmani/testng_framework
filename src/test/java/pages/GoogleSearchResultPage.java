package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchResultPage {

    public GoogleSearchResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "result-stats")
    public WebElement resultTag;
}
