package Homework0524;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
                driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.sendKeys("Alina");
        WebElement lastName = driver.findElement(By.cssSelector("input[name='last_name']"));
        lastName.sendKeys("Shania");
        WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("alinashania@gmail.com");
        Thread.sleep(2000);
        WebElement phone = driver.findElement(By.cssSelector("input[name='phone']"));
        phone.sendKeys("2026457446");
        WebElement address = driver.findElement(By.cssSelector("input[name='address']"));
        address.sendKeys("1501 Lincoln Way");
        WebElement city = driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Mclean");
        WebElement state = driver.findElement(By.xpath("//select[@name = 'state']"));
        state.click();
        WebElement stateSelect = driver.findElement(By.xpath("//option[text() = 'Virginia']"));
        stateSelect.click();
        WebElement zip = driver.findElement(By.cssSelector("input[name='zip']"));
        zip.sendKeys("22101");
        WebElement domain = driver.findElement(By.cssSelector("input[name='website']"));
        domain.sendKeys("Syntax");
        WebElement question = driver.findElement(By.cssSelector("input[name='hosting']"));
        question.click();
        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();
    }
}
