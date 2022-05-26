package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_TechGlobalTest extends Base{
    /*
    1. Go to "https://www.techglobalschool.com/apply-now"
    2. Validate the heading1 is displayed and the text for it is ="Application Form"
     */

    @Test(description = "TC123: Validate Application form heading")
    public void testApplicationFormHeading(){
        driver.get("https://www.techglobalschool.com/apply-now");

        //WebElement heading1 = driver.findElement(By.xpath("//div[@id='comp-kh9s3kyz3']//span/span"));

        Assert.assertTrue(tgApplicationPage.heading1.isDisplayed());
        Assert.assertEquals(tgApplicationPage.heading1.getText(), "Application Form"); //fails
    }
}