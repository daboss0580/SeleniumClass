package Class06;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://www.facebook.com/", "chrome");
        WebElement cookies = driver.findElement(By.xpath("//*[text()='Allow all cookies']"));
        if (cookies.isDisplayed()) {
            driver.findElement(By.xpath("//*[text()='Allow all cookies']")).click();
        }
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));
        WebElement create=driver.findElement(By.xpath("//*[text()='Create new account']"));
        create.click();
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        sendText("Chris",firstName);
    }
}
