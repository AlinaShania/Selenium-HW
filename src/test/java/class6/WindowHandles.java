package class6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandles extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp";
        String browser ="chrome";
        openBrowserAndLaunchApp(url,browser);

        WebElement helpBtn = driver.findElement(By.linkText("Help"));
        helpBtn.click();

        WebElement privacy = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();

        String mainPageHandle = driver.getWindowHandle();
        System.out.println("main page handle is :"+mainPageHandle);


//        get all the window handles and print the titles associated with each window handle
//        on the console

//        get all handles
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle:allHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
           // System.out.println("the title associated with "+handle+" is :"+title);

            if(title.equalsIgnoreCase("Google Account Help")){
                break;
            }

        }
        System.out.println("the current page under focus is: "+driver.getTitle());


        driver.switchTo().window(mainPageHandle);

        System.out.println("the focus now is on "+ driver.getTitle());
    }
}
