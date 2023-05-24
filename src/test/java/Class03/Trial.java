package Class03;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Trial extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("https://www.google.com/");
        Thread.sleep(2000);
        WebElement cookies=driver.findElement(By.xpath("//*[text()='Accept all']"));
        if (cookies.isDisplayed()){
            driver.findElement(By.xpath("//*[text()='Accept all']")).click();
        }


    }
}
