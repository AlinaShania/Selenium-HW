package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);
        driver.switchTo().frame(0);

        //find the draggable element
        WebElement draggable = driver.findElement(By.id("draggable"));
        //find the element where you want to drop
        WebElement droppable = driver.findElement(By.id("droppable"));

        //Action class
        Actions action = new Actions(driver);
        action.dragAndDrop(draggable,droppable).perform();
    }
}
