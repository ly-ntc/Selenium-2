package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public KeyPressPage clickKeyPress() {
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }

    public FileUploaderPage clickFileUploader() {
        clickLink("File Upload");
        return new FileUploaderPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDOMPage clickLargeAndDeepDOM() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll() {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public void clickLink(String link) {
        driver.findElement(By.linkText(link)).click();
    }
}
