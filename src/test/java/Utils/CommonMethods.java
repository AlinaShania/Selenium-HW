package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;

    public static void openBrowserAndLaunchApp(String URL, String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
//       maximize the window
        driver.manage().window().maximize();
        //navigate to the url
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement element){

        element.sendKeys(text);
    }

    public static void selectFromDropdown(WebElement dropDown, String visibleText) {
        Select sel = new Select(dropDown);
        sel.selectByVisibleText(visibleText);
    }

    public static void selectFromDropdown(String value, WebElement dropDown) {
        Select sel = new Select(dropDown);
        sel.selectByValue(value);
    }

    public static void selectFromDropdown(WebElement dropDown, int index) {
        Select sel = new Select(dropDown);
        sel.selectByIndex(index);
    }

    public static void takeScreenshot (String fileName)  {
        TakesScreenshot ts = (TakesScreenshot) driver;

        File screenshot = ts.getScreenshotAs(OutputType.FILE);

        try {

            FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"/screenshots/" + fileName+".png"));
        } catch (IOException e){
            e.printStackTrace();
        }
        /* try {
            FileUtils.copyFile(screenshot, new File("C:\Users\Denys\OneDrive\Desktop\" + fileName));
        } catch (IOException e){
            e.printStackTrace();
        }*/
    }

}
