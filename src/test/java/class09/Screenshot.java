package class09;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.ConcurrentModificationException;

public class Screenshot extends CommonMethods {
    public static void main(String[] args) throws IOException {


        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);

        //press login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",loginBtn);

        //take the screenshot

        TakesScreenshot ts = (TakesScreenshot) driver;

      File screenshot = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot, new File("C:\\Users\\Denys\\OneDrive\\Desktop\\screenshots\\imageTest1.png"));
    }
}
