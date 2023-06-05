package Class06HW;

import Class06.ImplicitWait;
import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW1 extends CommonMethods {
    /*
HW1:
goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
click on start
print the text  "welcome syntax technologies"on console
     */
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/dynamic-elements-loading.php","chrome");
        WebElement startBtn=driver.findElement(By.xpath("//*[@id=\"startButton\"]"));
        startBtn.click();
        WebDriverWait condition=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement printTxt=driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
        condition.until(ExpectedConditions.textToBePresentInElement(printTxt,"Welcome Syntax Technologies"));
        System.out.println(printTxt.getText());
        closeBrowser();
    }
}
