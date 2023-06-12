package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Task extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://amazon.com";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

       // WebElement allBtn = driver.findElement(By.id("nav-hamburger-menu"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript(allBtn.click());

        WebElement DD=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        js.executeScript("arguments[0].click();",DD);

    }
}
