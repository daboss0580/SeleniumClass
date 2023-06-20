package Class09;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionClassDemo1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("http://amazon.com/","chrome");
        WebElement signIn=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        Actions action=new Actions(driver);
        action.moveToElement(signIn);
        Thread.sleep(3000);
        WebElement btn=driver.findElement(By.xpath("//*[@id=\"9Lzdz6cL2YGc2V7pzj_F2g\"]/div[2]/a/div/img"));
        action.scrollToElement(btn);
    }
}
