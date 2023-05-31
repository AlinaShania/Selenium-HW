package HomeworkClass5;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url ="https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");

        WebElement option = driver.findElement(By.xpath("//select[@id='animals']"));

        Select select = new Select(option);
        select.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");

        WebElement text =driver.findElement(By.xpath("//input"));
        text.sendKeys("Not a Friendly Task Either");

        Thread.sleep(2000);

        driver.quit();



    }
}
