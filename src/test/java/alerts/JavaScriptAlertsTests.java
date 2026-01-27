package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavaScriptAlertsTests extends BaseTests {
    @Test
    public void testAcceptAlert() {
        var javascriptAlertPage = homePage.clickJavaScriptAlerts();
        javascriptAlertPage.triggerButton();
        javascriptAlertPage.acceptElement();
        assertEquals(javascriptAlertPage.getResult(),"You successfully clicked an alert");
    }

    @Test
    public void testConfirmAlert() {
        var javascriptAlertPage = homePage.clickJavaScriptAlerts();
        javascriptAlertPage.triggerConfirmButton();
        String text = javascriptAlertPage.getAlertText();
        javascriptAlertPage.dismissAlert();

        assertEquals(text, "I am a JS Confirm");
        assertEquals(javascriptAlertPage.getResult(),"You clicked: Cancel");
    }

    @Test
    public void testPromptAlert() {
        var javascriptAlertPage = homePage.clickJavaScriptAlerts();
        javascriptAlertPage.triggerPromptButton();
        String text = "ly";
        javascriptAlertPage.setPrompt(text);
        javascriptAlertPage.acceptElement();
        assertEquals("You entered: "+text,"You entered: ly");
    }
}
