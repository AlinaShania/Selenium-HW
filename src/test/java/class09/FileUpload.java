package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com/upload";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

        WebElement fileUploadBtn = driver.findElement(By.xpath("//input[@id='file-upload']"));


        fileUploadBtn.sendKeys("C:\\Users\\Denys\\OneDrive\\Desktop\\photoA1.jpg");
    }
}
