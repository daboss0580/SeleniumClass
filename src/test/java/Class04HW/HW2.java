package Class04HW;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("https://www.facebook.com/", "chrome");
        WebElement cookies = driver.findElement(By.xpath("//*[text()='Allow all cookies']"));
        if (cookies.isDisplayed()) {
            driver.findElement(By.xpath("//*[text()='Allow all cookies']")).click();
            Thread.sleep(1000);
            WebElement create = driver.findElement(By.xpath("//*[text()='Create new account']"));
            create.click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//option[text()='4']")).click();
            driver.findElement(By.xpath("//option[text()='May']")).click();
            driver.findElement(By.xpath("//option[text()='1980']")).click();
            Thread.sleep(2000);
            closeBrowser();
        }
    }
}
