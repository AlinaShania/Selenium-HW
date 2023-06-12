package class09;

import Utils.CommonMethods;
import org.openqa.selenium.JavascriptExecutor;

import javax.management.MBeanAttributeInfo;

public class JavaScriptExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);


//            perform a scroll operation
//            using java script

                JavascriptExecutor js=(JavascriptExecutor) driver;
//scroll down
                js.executeScript("window.scrollBy(0, 500)");
//        Thread.sleep for observation
                Thread.sleep(3000);
//        scroll up
                js.executeScript("window.scrollBy(0, -500)");

            }
        }

