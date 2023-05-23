package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.facebook.com");
        WebElement createAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAcc.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Alina");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shania");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("alinashania@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("alinashania@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Alina1234@");
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("March");
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("12");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1990");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        driver.quit();
    }
}src/
