package class6;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

        //click on a=enable button after 10 seconds
        //then click on the button

        WebElement button1 = driver.findElement(By.xpath("//button[@id='enable-button']"));
        button1.click();

        //declare the wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));


        WebElement eBtn = driver.findElement(By.linkText("//button[text()='Button']"));
        eBtn.click();

        //        click on the alert button
        WebElement alertBtn = driver.findElement(By.xpath("//button[@id='alert']"));
        alertBtn.click();
//
        wait.until(ExpectedConditions.alertIsPresent());
        Alert aler = driver.switchTo().alert();
        aler.accept();
    }
}
