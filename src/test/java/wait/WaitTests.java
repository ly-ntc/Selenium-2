package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUnitHidden() {
        var dynamicLoadingPage = homePage.clickDynamicLoading();
        var DynamicExample1Page = dynamicLoadingPage.clickExample1();
        DynamicExample1Page.clickStartButton();
        assertEquals(DynamicExample1Page.getLoadedText(),"Hello World!" );
    }
}
