package HomeworkClass5;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url ="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);
        WebElement alert1Btn = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1Btn.click();
        Thread.sleep(2000);
        Alert confirmation = driver.switchTo().alert();
        confirmation.accept();

        WebElement alert2btn = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2btn.click();
        Thread.sleep(2000);
        Alert  confirmation1 = driver.switchTo().alert();
        confirmation1.accept(); //or you can dismiss

        WebElement alert3btn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3btn.click();
        Thread.sleep(2000);
        Alert confirmation3 = driver.switchTo().alert();
        confirmation3.sendKeys("Alina");
        Thread.sleep(2000);
        confirmation3.accept();

    }


}