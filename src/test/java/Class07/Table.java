package Class07;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Table extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("https://www.techlistic.com/p/demo-selenium-practice.html", "chrome");
        WebElement cookies = driver.findElement(By.xpath("//*[@id=\"ez-accept-all\"]"));
        if (cookies.isDisplayed()) {
            cookies.click();
        }
       Thread.sleep(5000);
        WebElement wholeTable=driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[2]"));

        String tb=wholeTable.getText();
        System.out.println(tb);

    }
}
