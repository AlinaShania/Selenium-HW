package HomeworkClass8;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");

        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");

        WebElement loginBTN = driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBTN.click();

        WebElement recruitmentBtn = driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
        recruitmentBtn.click();

        WebElement calendar = driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]"));
        calendar.click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select((month));
        select.selectByValue("3");

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1 = new Select(year);
        select1.selectByValue("2022");

       WebElement date = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[6]"));
       date.click();



    }
}
