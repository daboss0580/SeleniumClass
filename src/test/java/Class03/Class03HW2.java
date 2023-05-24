package Class03;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Class03HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        WebElement userName=driver.findElement(By.cssSelector("input[name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.cssSelector("input[name='txtPassword']"));
        password.sendKeys("");
        WebElement submit=driver.findElement(By.cssSelector("input[name='Submit']"));
        submit.click();
        WebElement response=driver.findElement(By.xpath("//*[text()='Password cannot be empty']"));
        if (response.equals(driver.findElement(By.xpath("//*[text()='Password cannot be empty']")))){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");

            //I know we can achieve this with if condition but I'm surely missing something
            //I hope to find out in today's class
        }
        Thread.sleep(3000);
        closeBrowser();
    }
}
