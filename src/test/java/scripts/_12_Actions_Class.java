package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;
import java.time.Duration;

public class _12_Actions_Class extends Base{

    @Test(priority = 1, description = "Actions | move to element 1")
    public void moveToElementPractice1(){
        driver.get("https://www.techglobalschool.com/");

        WebElement address = driver.findElement(By.cssSelector("#comp-kixny3ro span>span"));

        actions.moveToElement(address).build().perform(); //build is not required in newer version, but perform is
        Waiter.pause(2);

        Assert.assertEquals(address.getText(),"2860 S River Rd Suite 350, Des Plaines IL 60018");
    }

    /*
    Go to https://www.carvana.com/
    Hover over “FINANCING” menu item (dropdown)
    Validate below items are displayed

    WHY FINANCE WITH CARVANA
    GET PREQUALIFIED
    AUTO LOAN CALCULATOR
     */

    @Test(priority = 2, description = "Actions | move to element 2")
    public void moveToElementPractice2(){
        driver.get("https://www.carvana.com/");

        actions.moveToElement(carvanaHomePage.financeDropdown).perform();
        Waiter.pause(2);

        for (int i = 0; i < carvanaHomePage.financeDropdownOptions.size(); i++) {
            Assert.assertTrue(carvanaHomePage.financeDropdownOptions.get(i).isDisplayed());
            switch(i){
                case (0):
                    Assert.assertEquals(carvanaHomePage.financeDropdownOptions.get(i).getText(), "WHY FINANCE WITH CARVANA");
                    break;
                case (1):
                    Assert.assertEquals(carvanaHomePage.financeDropdownOptions.get(i).getText(), "GET PREQUALIFIED");
                    break;
                case (2):
                    Assert.assertEquals(carvanaHomePage.financeDropdownOptions.get(i).getText(), "AUTO LOAN CALCULATOR");
                    break;
                default:
                    throw new NotFoundException("Unexpected element found in the list!!!");
            }
        }
    }

    /*
    Go to https://www.techglobalschool.com/
    Click on "Register for Intro Session" link
    Validate the url is https://www.techglobalschool.com/apply-now-1
     */

    @Test(priority = 3, description = "Actions class | click on element ")
    public void clickOnElementPractice(){
        driver.get("https://www.techglobalschool.com/");

        actions.moveToElement(tgHomePage.introSessionButton).pause(Duration.ofSeconds(2)).click().perform();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.techglobalschool.com/apply-now-1");
    }

    /*
    Go to https://www.techglobalschool.com/
    Right click on “Request an Intro Session” button
    Validate the url is still https://www.techglobalschool.com/
     */

    @Test(priority = 4, description = "Actions | Right click on element ")
    public void rightClickPractice(){
        driver.get("https://www.techglobalschool.com/");

        actions.moveToElement(tgHomePage.introSessionButton).contextClick().perform();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.techglobalschool.com/");
    }

    /*
    Go to https://demoqa.com/droppable
    Click and hold ”Drag me” box and release it on “Drop here” box
    Validate “Drop here” text is replaced with “Dropped!”
     */

    @Test(priority = 5, description = "Actions class | click-hold-release an element | Drag and drop")
    public void clickHoldAndReleasePractice(){
        driver.get("https://demoqa.com/droppable");

        //actions.clickAndHold(demoQAPage.dragMeBox).moveToElement(demoQAPage.dropHereBox).release().perform();
        actions.dragAndDrop(demoQAPage.dragMeBox,demoQAPage.dropHereBox).perform();

        Assert.assertEquals(demoQAPage.dropHereBox.getText(), "Dropped!");
    }

    /*
    Go to https://www.google.com/
    Enter "Hello" to search input box
    Validate value attribute is "Hello"
     */

    @Test(priority = 6, description = "Actions class | send keys to an element")
    public void sendKeysToAnElement(){
        driver.get("https://www.google.com/");

        actions.sendKeys(googleSearchPage.searchInputBox, "Hello").perform();

        Assert.assertEquals(googleSearchPage.searchInputBox.getAttribute("value"), "Hello");
    }

    @Test(priority = 7,description = "Actions | key down and key up")
    public void practiceKeyDownAndKeyUp(){
        driver.get("https://www.google.com/");

        actions.keyDown(Keys.SHIFT)
                .sendKeys(googleSearchPage.searchInputBox, "techglobal")
                .keyUp(Keys.SHIFT)
                .pause(Duration.ofSeconds(2))
                .keyDown(Keys.COMMAND).sendKeys("a")
                .pause(Duration.ofSeconds(2))
                .sendKeys("c")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.ARROW_RIGHT)
                .pause(Duration.ofSeconds(2))
                .keyDown(Keys.COMMAND).sendKeys("v")
                .perform();

        Waiter.pause(2);

        Assert.assertEquals(googleSearchPage.searchInputBox.getAttribute("value"), "TECHGLOBALTECHGLOBAL");
    }
}
