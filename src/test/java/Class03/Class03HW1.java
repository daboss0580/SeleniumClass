package Class03;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Class03HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/input-form-demo.php");
        WebElement firstName = driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.sendKeys("Kenny");
        WebElement lastName = driver.findElement(By.cssSelector("input[name='last_name']"));
        lastName.sendKeys("Williams");
        WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("kennywilliams@ymail.com");
        WebElement phone = driver.findElement(By.cssSelector("input[name='phone']"));
        phone.sendKeys("0127463958");
        WebElement address = driver.findElement(By.cssSelector("input[name='address']"));
        address.sendKeys("346 Oldham Road");
        WebElement city = driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Manchester");
        WebElement state = driver.findElement(By.cssSelector("select[name='state']"));
        state.sendKeys("Arizona");
        WebElement zipCode = driver.findElement(By.cssSelector("input[name='zip']"));
        zipCode.sendKeys("23950");
        WebElement webSite = driver.findElement(By.cssSelector("input[name='website']"));
        webSite.sendKeys("Arizona");
        WebElement hosting = driver.findElement(By.cssSelector("input[value='yes']"));
        hosting.sendKeys("Arizona");
        WebElement description = driver.findElement(By.cssSelector("textarea[name='comment']"));
        description.sendKeys("Best of quality");
        WebElement send = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        send.click();
        Thread.sleep(3000);
        closeBrowser();
    }

}
