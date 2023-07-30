package review;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsReview extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://the-internet.herokuapp.com/dynamic_controls";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement removeBtn = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeBtn.click();

        WebElement text = driver.findElement(By.xpath("//button[text()='Add']/following-sibling::p"));
        System.out.println(text.getText());

        WebElement enableBTN = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableBTN.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='input-example']/child::input")));

        WebElement textBox = driver.findElement(By.xpath("//form[@id='input-example']/child::input"));
        System.out.println(textBox.isEnabled());


    }
}
