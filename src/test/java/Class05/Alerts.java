package Class05;

import Utilities.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/javascript-alert-box-demo.php","chrome");
        WebElement alertBtn=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertBtn.click();
        Thread.sleep(2000);
        Alert confirmation1=driver.switchTo().alert();
        confirmation1.accept();

        WebElement alert2Btn=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2Btn.click();
        Thread.sleep(2000);
        Alert confirmation2=driver.switchTo().alert();
        confirmation2.dismiss();

        WebElement alert3Button=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Button.click();
        Thread.sleep(3000);
        Alert confirmation3=driver.switchTo().alert();
        confirmation3.sendKeys("Justin");
        confirmation3.accept();
    }

}
