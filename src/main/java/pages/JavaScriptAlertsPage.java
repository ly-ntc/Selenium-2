package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()=\"Click for JS Alert\"]");
    private By triggerConfirmButton = By.xpath(".//button[text()=\"Click for JS Confirm\"]");

    private By triggerPromptButton = By.xpath(".//button[text()=\"Click for JS Prompt\"]");
    private By result = By.id("result");
    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerButton() {
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirmButton() {
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPromptButton() {
        driver.findElement(triggerPromptButton).click();
    }

    public void setPrompt(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
    public void acceptElement() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
    public String getResult() {
        return driver.findElement(result).getText();
    }
}
