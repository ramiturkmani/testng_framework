package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeroAppPage {
    public HeroAppPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul/li/a")
    public List<WebElement> links;

    @FindBy(css = "#checkboxes>input")
    public List<WebElement> checkboxes;

    public void clickOnLink(String linkText){
        for (WebElement link : links) {
            if (link.getText().equals(linkText)){
                link.click();
                break;
            }
        }
    }

}
