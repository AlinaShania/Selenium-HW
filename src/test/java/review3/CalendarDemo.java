package review3;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CalendarDemo extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.delta.com/";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);

       WebElement calendar = driver.findElement(By.xpath("//div[@role='button']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",calendar);

        //get the month
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        boolean found = false;
        while (!found) {
            String currentMONTH = month.getText();

            if (currentMONTH.equals("September")) {
                found = true;
            } else {
                //next button
                WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextBtn.click();
            }
        }
        List<WebElement> Dates = driver.findElements(By.xpath("//table/tbody/tr/td"));
        for (WebElement date:Dates){
            String dd = date.getText();
        if (dd.equals("17")){
            date.click();
            break;
        }
        }
        takeScreenshot("selectedDate");

    }
}
