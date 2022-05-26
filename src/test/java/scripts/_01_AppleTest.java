package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_AppleTest extends Base{

    @Test(priority = 1, description = "TC345")
    public void testAppleTitle(){
        driver.get("https://www.apple.com/");

        String expectedTitle = "Apple"; // requirement
        String actualTitle = driver.getTitle(); // development

        /*
        Instead of these if-else validation, we will use TestNG assertion
        if(actualTitle.equals(expectedTitle)) System.out.println("Apple title validation passed");
        else System.out.println("Apple title validation failed");
         */

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 2, description = "TC873")
    public void testAppleURL(){
        driver.get("https://www.apple.com/");

        String expectedURL = "https://www.apple.com/";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);
    }


    @Test(enabled = false, priority = 3, description = "TC092")
    public void X(){
        //fail() method is used to fail a test on purpose
        //We use this for known issues
        Assert.fail("Failure on purpose");
    }




    /*
    public static void main(String[] args) {
        // 1. Initial set up - before each test
        WebDriver driver = Driver.getDriver();
        // 2. Validation of test - test
        driver.get("https://www.apple.com/");
        String expectedTitle = "Apple"; // requirement
        String actualTitle = driver.getTitle(); // development
        if(actualTitle.equals(expectedTitle)) System.out.println("Apple title validation passed");
        else System.out.println("Apple title validation failed");
        // 3. Teardown actions - after each test
        Driver.quitDriver();
    }
     */
}