package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(),'%s')]";
    private By example1Link = By.xpath(String.format(linkXpath_Format, "Example 1"));
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicExample1Page clickExample1() {
        driver.findElement(example1Link).click();
        return new DynamicExample1Page(driver);
    }
}
