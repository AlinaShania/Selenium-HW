package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        WebElement userPassword = driver.findElement(By.id("txtPassword"));
        userPassword.sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        userPassword.clear();
        userPassword.sendKeys("Hum@nhrm123");
       WebElement loginBtn = driver.findElement(By.className("button"));
       loginBtn.click();

      WebElement message =  driver.findElement(By.linkText("Welcome Admin"));
      String text = message.getText();
        System.out.println(text);

        driver.findElement(By.partialLinkText("Recru")).click();
    }
}
