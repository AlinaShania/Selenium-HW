package review3;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionReview extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));

        Actions action = new Actions(driver);
        action.click(loginButton).perform();

        WebElement leaveTab = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        action.moveToElement(leaveTab).perform();




    }
}
