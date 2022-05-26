package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_GoogleTest extends Base{

    @Test(priority = 1, description = "TC765: Validate Google search")
    public void testGoogleSearch(){
        driver.get("https://www.google.com/");

        googleSearchPage.searchInputBox.sendKeys("Selenium" + Keys.ENTER);

        String results = googleSearchResultPage.resultTag.getText();

        Assert.assertTrue(Long.parseLong(results.substring(results.indexOf(" "),results.indexOf("results")-1).replaceAll("[^\\d]","")) > 0);
    }
}
