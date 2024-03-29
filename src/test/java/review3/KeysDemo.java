package review3;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class KeysDemo extends CommonMethods {
    public static void main(String[] args) throws InterruptedException, IOException {

        String url = "https://the-internet.herokuapp.com/key_presses";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);

        WebElement textBox = driver.findElement(By.id("target"));
        textBox.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        textBox = driver.findElement(By.id("target"));

        textBox.sendKeys(Keys.TAB);
        textBox = driver.findElement(By.id("target"));

        Thread.sleep(2000);
        textBox.sendKeys(Keys.ARROW_DOWN);


       /* TakesScreenshot ts = (TakesScreenshot) driver;
        File ss = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss, new File(System.getProperty("user.dir")+"/screenshots/abc.png")); */

        takeScreenshot("Myss");

    }
}
