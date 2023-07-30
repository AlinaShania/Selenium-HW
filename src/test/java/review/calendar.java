package review;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class calendar extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));

        loginButton.click();

        WebElement recruitment = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitment.click();

        WebElement calendar = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']/following-sibling::img"));
        calendar.click();

        WebElement monthDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(monthDD);
        select.selectByVisibleText("Sep");

        WebElement yearDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1 = new Select(yearDD);
        select1.selectByVisibleText("1923");

        //getting the table of dates
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for (WebElement date :dates){
          String dateToday = date.getText();
          if(dateToday.equals("12")){
              date.click();
              break;
          }
        }
    }
}
