package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.TimeUnit;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();

//        driver.manage().window().maximize();
        //responsive
//        driver.manage().window().setSize(new Dimension(375, 812));
    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Path dest = Paths.get("src/test/resources/images/" + result.getName()+".png");
                Files.move(screenshot.toPath(),
                        dest, StandardCopyOption.REPLACE_EXISTING);
                System.out.println(dest.toAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
//    public void takeScreenshot(ITestResult result) throws Exception {
//        var camera = (TakesScreenshot) driver;
//        File screenshot = camera.getScreenshotAs(OutputType.FILE);
//
//        String fileName = result.getName() + "_" + System.currentTimeMillis() + ".png";
//
//        String destPath = System.getProperty("user.dir") +
//                "/src/test/resources/images/" + fileName;
//
//        File destFile = new File(destPath);
//        destFile.getParentFile().mkdirs();
//
//        Files.copy(screenshot.toPath(), destFile.toPath());
//
//        System.out.println("==> Saved screenshot: " + destPath);
//    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
