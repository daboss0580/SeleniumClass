package Class06HW;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW2 extends CommonMethods {
    /*
    goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
click on get new user
print the firstname of user
     */
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/dynamic-data-loading-demo.php", "chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement gnuBtn=driver.findElement(By.xpath("//button[@id=\"save\"]"));
        gnuBtn.click();
        WebElement getFName=driver.findElement(By.xpath("//div[@id=\"First-Name\"]/p"));
        System.out.println(getFName.getText());
        closeBrowser();
    }
}
