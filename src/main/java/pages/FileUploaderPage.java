package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage {
    private WebDriver driver;
    private By fileInput = By.id("file-upload");
    private By fileSubmit = By.id("file-submit");
    private By result = By.id("uploaded-files");

    public FileUploaderPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterFileInput(String path) {
        driver.findElement(fileInput).sendKeys(path);
    }
    public void clickFileSubmitButton(){
        driver.findElement(fileSubmit).click();
    }
    public String getResult() {
        return driver.findElement(result).getText();
    }
}
