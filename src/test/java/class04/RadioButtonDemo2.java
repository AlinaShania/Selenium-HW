package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

        //get all the radio buttons assosiated with age group

       List<WebElement> ageGroup = driver.findElements(By.xpath("//input[@name='ageGroup']"));

       String option = "5-15";

       for(WebElement age : ageGroup){
           String value = age.getAttribute("value");
           if(value.equals(option)){
               age.click();
               break;

           }
       }

    }
}
