package Class05;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Try extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://www.facebook.com/", "chrome");
        WebElement cookies = driver.findElement(By.xpath("//*[text()='Allow all cookies']"));
        if (cookies.isDisplayed()) {
            driver.findElement(By.xpath("//*[text()='Allow all cookies']")).click();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement createAcc=driver.findElement(By.xpath("//*[text()='Create new account']"));
        createAcc.click();
        WebElement dd1=driver.findElement(By.xpath("//select[@id=\"day\"]"));
        singleSelectFromDropdownByIndex(15,dd1);
    }
}
