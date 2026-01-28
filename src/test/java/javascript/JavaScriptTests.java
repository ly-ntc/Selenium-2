package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {
    @Test
    public void testScrollTable() throws InterruptedException {
        var largeAndDeepDOMPage = homePage.clickLargeAndDeepDOM();
        largeAndDeepDOMPage.scrollTable();
    }

    @Test
    public void testScrollToParagraph() throws InterruptedException {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
