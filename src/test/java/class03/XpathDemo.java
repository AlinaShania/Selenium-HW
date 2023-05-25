package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        //instance of the driver
        WebDriver driver = new ChromeDriver();
        //driver.get navigates us to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");

        //password xbox
        WebElement userPass = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        userPass.sendKeys("Hum@nhrm123");

        //login click
        WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@id,'btnLogin')]"));
        loginBtn.click();

        //click on PIM Button
        WebElement pimTab = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimTab.click();
    }
}
