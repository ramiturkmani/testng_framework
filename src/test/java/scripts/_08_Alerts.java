package scripts;


import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeroAppPage;
import utilities.AlertHandler;

public class _08_Alerts extends Base{

    @Test(priority = 1, description = "TASK-1")
    public void testEtsySignInModal(){
        driver.get("https://etsy.com/");

        etsySearchPage.signInButton.click();

        Assert.assertTrue(etsySearchPage.signInModal.isDisplayed());
        Assert.assertEquals(etsySearchPage.signInModalHeading.getText(), "Sign in");

    }

    /*
    Go to http://the-internet.herokuapp.com/
    Click on "JavaScript Alerts" link
    Click on "Click for JS Alert" button
    Validate the text of the alert displayed is "I am a JS Alert"
    Click on "OK" button on the alert
    Validate "You successfully clicked an alert" message is displayed with its text
     */

    @Test(priority = 2, description = "TASK-2 - Information-Warning alert")
    public void testInformationWarningAlert(){
        driver.get("http://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("JavaScript Alerts");
        heroAppPage.clickOnAlertButton("Click for JS Alert");
        Alert alert = driver.switchTo().alert();

        Assert.assertEquals(alert.getText(), "I am a JS Alert");

        alert.accept(); // Click on OK
        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You successfully clicked an alert");
    }

    /*
    1.Go to http://the-internet.herokuapp.com/
    2.Click on “JavaScript Alerts” link
    3.Click on “Click for JS Confirm” button
    4.Validate the text of the alert displayed is “I am a JS Confirm”
    5.Click on ”Cancel” button on the alert
    6.Validate “You clicked: Cancel” message is displayed with its text
    7.Click on “Click for JS Confirm” button again
    8.Click on ”OK” button on the alert
    9.Validate “You clicked: Ok” message is displayed with its text
     */

    @Test(priority = 3, description = " TASK-3 Confirmation Alert")
    public void testConfirmationAlert(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("JavaScript Alerts");
        heroAppPage.clickOnAlertButton("Click for JS Confirm");
        Assert.assertEquals(AlertHandler.getAlertsText(driver), "I am a JS Confirm");

        //driver.switchTo().alert().dismiss(); //Cancel
        AlertHandler.dismissAlert(driver);
        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You clicked: Cancel");

        heroAppPage.clickOnAlertButton("Click for JS Confirm");

        //driver.switchTo().alert().accept(); // OK
        AlertHandler.acceptAlert(driver);

        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You clicked: Ok");
    }

    /*
    TASK-4 Prompt Alert
    Go to http://the-internet.herokuapp.com/
    Click on "JavaScript Alerts" link
    Click on "Click for JS Prompt" button
    Validate the text of the alert displayed is "I am a JS prompt"
    Click on "Cancel" button on the alert
    Validate "You entered: null" message is displayed with its text
    Click on "Click for JS Prompt" button again
    Type "Hello" in the alert input box
    Click on "OK" button on the alert
    Validate "You entered: Hello" message is displayed with its text
    */

    @Test(priority = 4, description = "TASK-4 Prompt Alert")
    public void testPromptAlert(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("JavaScript Alerts");
        heroAppPage.clickOnAlertButton("Click for JS Prompt");
        Assert.assertEquals(AlertHandler.getAlertsText(driver), "I am a JS prompt");
        AlertHandler.dismissAlert(driver);
        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You entered: null");

        heroAppPage.clickOnAlertButton("Click for JS Prompt");
        AlertHandler.sendKeysToAlert(driver, "Hello");
        AlertHandler.acceptAlert(driver);
        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You entered: Hello");
    }

     /*
    TASK-5 - Amazon Address Modal
    Go to https://www.amazon.com/
    Click on "Select your address" link in the top navigation bar
    Validate "Choose your location" modal is displayed
    Enter your zip code to input box
    Click on "Apply" button
    Validate the zip code entered displayed in the delivery message
     */

    @Test(priority = 5, description = "TASK-5 - Amazon Address Modal")
    public void testAmazonAddressModal(){

    }
}
