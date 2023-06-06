package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

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
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement element){

        element.sendKeys(text);
    }

    public static void selectedByValue(WebElement element, String value) throws InterruptedException {

        Select state = new Select(element);
        state.selectByValue(value);
    }
}
