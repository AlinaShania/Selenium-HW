package Utils;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonMethodsTester extends CommonMethods {

    public static void main(String[] args) {

        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);

        WebElement createNewAccBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccBtn.click();

        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
       // selectFromDropdown("5", month);
        selectFromDropdown(day, "2");
        //selectFromDropdown(year, 34);
    }
}
