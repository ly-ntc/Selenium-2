package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressTests extends BaseTests {
    @Test
    public void testBackspace() {
        var keyPage = homePage.clickKeyPress();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResultText(), "You entered: BACK_SPACE?");
    }
    
}
