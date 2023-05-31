package Class05;

import Utilities.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/javascript-alert-box-demo.php","chrome");
        WebElement alert3Button=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Button.click();
        Thread.sleep(3000);
        Alert confirmation=driver.switchTo().alert();
        confirmation.sendKeys("Justin");
        confirmation.accept();
        Thread.sleep(2000);
        closeBrowser();


    }
}
