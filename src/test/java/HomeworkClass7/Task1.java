package HomeworkClass7;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

        Thread.sleep(2000);

         driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");

         driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");

        WebElement loginBTN = driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBTN.click();

        WebElement PIM = driver.findElement(By.xpath("//b[contains(text(),'PIM')]"));
        PIM.click();

        List<WebElement> allID= driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        for(int i=0;i< allID.size();i++){
            String id = allID.get(i).getText();
            if(id.equals("54374A")){
                System.out.println("The row number with ID 54374A is "+(i+1));
            }
        }














      /*  WebElement wholeTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String allText = wholeTable.getText();
        System.out.println(allText);


        //print all the rows of the table

        //modified: print the row that contains google

        List<WebElement> allRows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        for (WebElement row:allRows){
            String rowText = row.getText();
            if(rowText.contains("Google")) {
                System.out.println(rowText);
            }
        }

       // allRows.get(2).getText();
        System.out.println("_____________________________________________________________________________________");
        //print each and every data in the table

       List<WebElement> allCellData= driver.findElements(By.xpath("//table[@id='customers']tbody/tr/td"));
        for(WebElement cell:allCellData){
            String cellData = cell.getText();
            System.out.println(cellData);
        }
*/

    }
}
