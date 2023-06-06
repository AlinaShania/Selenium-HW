package HomeworkClass6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

        WebElement startButton = driver.findElement(By.xpath("//button[@id='startButton']"));
        startButton.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[contains(text(),'Welcome Syntax Technologies')]")));

        WebElement text = driver.findElement(By.xpath("//h4[contains(text(),'Welcome Syntax Technologies')]"));

        System.out.println(text.getText());




    }
}
