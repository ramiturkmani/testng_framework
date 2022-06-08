package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RediffHomePage {
    public RediffHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class^='cell']")
    public List<WebElement> moneyCells;

    @FindBy(id = "moneyiframe")
    public WebElement moneyIFrame;
}