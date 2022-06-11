package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _11_FileUpload extends Base{
    /*
    Create a file in your project called “myFile.txt”
    Go to http://the-internet.herokuapp.com/
    Click on “File Upload” link
    Choose created file to be uploaded to the page
    Click on “Upload” button
    Validate “File Uploaded!” heading3 text
    Validate ”myFile.txt” in the uploaded file list
     */

    @Test(priority = 1, description = "File upload")
    public void testFileUpload(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("File Upload");

        heroAppPage.chooseFileInputBox.sendKeys("/Users/ramiturkmani/IdeaProjects/testng_framework/myFileRami.txt");

        heroAppPage.uploadFileButton.click();

        Assert.assertEquals(heroAppPage.fileUploadedH3.getText(), "File Uploaded!");
        Assert.assertEquals(heroAppPage.uploadedFileText.getText(), "myFileRami.txt");
    }

    /*
    Go to http://the-internet.herokuapp.com/
    Click on “File Download” link
    Click on “myFileRami.txt” link
    Validate “myFileRami.txt” file is downloaded in your “Downloads” folder
     */

    @Test(priority = 2, description = "File download")
    public void testFileDownload(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("File Download");

        heroAppPage.downloadFileLink.click();
    }
}
