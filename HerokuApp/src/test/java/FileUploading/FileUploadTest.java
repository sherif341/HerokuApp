package FileUploading;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTests {
    @Test
    public void testUploadFile(){
        var fileUpload=homePage.ClickingFileUploadLink();
        fileUpload.uploadingFile("H:\\Programs\\HerokuApp\\Midjorny.png");
        Assert.assertTrue(fileUpload.getUploadedFilesName().contains("Midjorny"));

    }
}
