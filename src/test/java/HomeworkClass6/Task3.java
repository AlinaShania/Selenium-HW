package HomeworkClass6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class Task3 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/input-form-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);

        List<WebElement> options = driver.findElements(By.xpath("//select[@name='state']/option"));
        //
        for (WebElement option : options) {
            System.out.println(option.getText());
            if (option.getText().equals("Indiana")) {
                String state = option.getText();
                System.out.println("--- "+state);
                //selectedByValue(option, "state");
                option.click();
                break;
            }
            //break;
        }
    }
}