package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExpediaPage {
    public ExpediaPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='primary-navigation']//button")
    public WebElement moreTravelDropdown;

    @FindBy(css = "a[data-stid='flight-link']")
    public WebElement flights;

    @FindBy(id = "preferred-class-input-trigger")
    public WebElement flightTypesDropdown;

    @FindBy(css = "#preferred-class-input>div a")
    public List<WebElement> flightOptions;


}
