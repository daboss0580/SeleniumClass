package Class09;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutorDemo3 extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login","chrome");
        //        find the text box
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));

//        JSExecutor
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);
//        script




    }
}
