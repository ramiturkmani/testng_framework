package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQAPage {
    public DemoQAPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "draggable")
    public WebElement dragMeBox;

    @FindBy(id = "droppable")
    public WebElement dropHereBox;
}
