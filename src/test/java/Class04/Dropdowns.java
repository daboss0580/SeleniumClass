package Class04;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("https://www.facebook.com/", "chrome");
        WebElement cookies = driver.findElement(By.xpath("//*[text()='Allow all cookies']"));
        if (cookies.isDisplayed()) {
            driver.findElement(By.xpath("//*[text()='Allow all cookies']")).click();
            Thread.sleep(1000);
            WebElement create = driver.findElement(By.xpath("//*[text()='Create new account']"));
            create.click();
            Thread.sleep(2000);
//     1.   find the element associate with the dropdown
            WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
//        2.create an object of the select class and pass in the parameters the element dropdown
            Select sel = new Select(days);

//        3.use method provided in select class to select the option that u desire
            sel.selectByVisibleText("8");
//       for observation
            Thread.sleep(2000);
//        another method
            sel.selectByValue("26");
//       for observation
            Thread.sleep(2000);
//        another method
            sel.selectByIndex(0);

        }
    }
}