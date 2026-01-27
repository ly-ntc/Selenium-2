package files;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadsTests extends BaseTests {
    @Test
    public void testFileUpload() {
        var fileUpload = homePage.clickFileUploader();
        fileUpload.enterFileInput("F:\\ảnh\\4.jpg");
        fileUpload.clickFileSubmitButton();
        assertEquals(fileUpload.getResult(),"4.jpg" );
    }
}
