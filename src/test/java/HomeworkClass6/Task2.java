package HomeworkClass6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Task2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement getNewUser = driver.findElement(By.xpath("//button[@id='save']"));
        getNewUser.click();
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println("First Name is "+firstName.getText());
    }
}
