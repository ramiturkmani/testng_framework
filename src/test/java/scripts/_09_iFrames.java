package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _09_iFrames extends Base{
    /*
    1. Go to http://the-internet.herokuapp.com/
    2. Click on “Frames” link
    3. Click on “iFrame” link
    4. Clear text “Your content goes here.” in the content
    box
    5. Enter “Hello World” in the content box
    6. Validate the text of the content box is “Hello
    World”
    7. Validate the heading3 as “An iFrame containing the
    TinyMCE WYSIWYG Editor”
     */


    @Test(priority = 1)
    public void testIFrame1(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Frames");
        heroAppPage.iFrameLink.click();

        //switch to inner html - iframe
        //driver.switchTo().frame(0);
        //driver.switchTo().frame("mce_0_ifr");
        driver.switchTo().frame(heroAppPage.innerIFrame);

        heroAppPage.contentBox.clear();
        heroAppPage.contentBox.sendKeys("Hello World");
        Assert.assertEquals(heroAppPage.contentBox.getText(), "Hello World");

        //Switch back to parent html - outer
        //driver.switchTo().parentFrame(); -> goes back 1 frame level
        driver.switchTo().defaultContent(); //goes out to the outermost frame
        Assert.assertEquals(heroAppPage.iFrameHeading3.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor");
    }


    /*
    Go to https://www.rediff.com/
    Validate money iFrame displayed with cell one and cell two
     */
    @Test(priority = 2)
    public void testIFrame2(){
        driver.get("https://www.rediff.com/");

        driver.switchTo().frame(rediffHomePage.moneyIFrame);
        //driver.switchTo().frame(0);
        //driver.switchTo().frame("moneyiframe");

        for(WebElement element : rediffHomePage.moneyCells){
            Assert.assertTrue(element.isDisplayed());
        }
    }
}
