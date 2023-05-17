package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Alina");
        driver.findElement(By.id("customer.lastName")).sendKeys("Shania");
        driver.findElement(By.id("customer.address.street")).sendKeys("6765 Lincoln Way");
        driver.findElement(By.id("customer.address.city")).sendKeys("Mclean");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22101");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("202645-7363");
        driver.findElement(By.id("customer.ssn")).sendKeys("213871554");
        driver.findElement(By.id("customer.username")).sendKeys("shaniaalina");
        driver.findElement(By.id("customer.password")).sendKeys("spookieseason123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("spookieseason123");
        Thread.sleep(4000);
        driver.quit();


    }
}
