package Homework0524;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='txtUsername")).sendKeys("Admin");
        WebElement login = driver.findElement(By.cssSelector("input[name='Submit']"));
        login.click();
        WebElement emptyPasswordMsg = driver.findElement(By.xpath("//span[contains(text(),'Password cannot')]"));
        String error = emptyPasswordMsg.getText();
        String errorMessage = "Password cannot be empty";
        if (error.equals(errorMessage)){
            System.out.println("Error message verified and it is : "+errorMessage);
        } else {
            System.out.println("Error message is not verified");
        }
    }
}
