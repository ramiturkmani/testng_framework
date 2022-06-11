package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarvanaHomePage {
    public CarvanaHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ccUPxJ")
    public WebElement financeDropdown;

    @FindBy(css = ".ewpFSy a")
    public List<WebElement> financeDropdownOptions;
}
