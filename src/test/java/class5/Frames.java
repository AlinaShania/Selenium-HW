package class5;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Frames extends CommonMethods {
    public static void main(String[] args) {
        String url ="https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

        //task1 print animal on screen and select babycat from drop down

        //as the webelement is inside a frame - first we need to switch it
        //Step1
        driver.switchTo().frame(1);
        //find the webelement Animal:
       WebElement animal = driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());

        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));

        Select select = new Select(dd);
        select.selectByVisibleText("Baby Cat");

        //switch focus to the main page

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");
        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("abracadabra");

        //switch to iframe

        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.id("a")).click();

    }
}
