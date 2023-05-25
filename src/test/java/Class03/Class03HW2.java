package Class03;

import Utilities.CommonMethods;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Class03HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D", "chrome");
        WebElement userName = driver.findElement(By.cssSelector("input[name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("input[name='txtPassword']"));
        password.sendKeys("");
        WebElement submit = driver.findElement(By.cssSelector("input[name='Submit']"));
        submit.click();
        WebElement actualError = driver.findElement(By.cssSelector("span[id=spanMessage"));
        String error = actualError.getText();
        if (error.equals("Password cannot be empty")) {
            System.out.println("Error message verification Passed");
        } else {
            System.out.println("Error message verification Failed");
        }
        Thread.sleep(1000);
        closeBrowser();
    }
}
