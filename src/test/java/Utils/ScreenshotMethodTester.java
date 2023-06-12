package Utils;

public class ScreenshotMethodTester extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);

        Thread.sleep(2000);


        takeScreenshot("Alina.png");
    }
}
