package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement cookies = driver.findElement(By.cssSelector("a[data-testid"));
        if (cookies.isDisplayed()) {
          WebElement cooKies =driver.findElement(By.cssSelector("button[title='Allow all cookies']"));
          cooKies.click();
          WebElement create=driver.findElement(By.cssSelector("a[data-testid"));
          create.click();
          Thread.sleep(1000);
          driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Tony");
          driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Williams");
          driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("tonywilliams@yahoo.com");
          driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("tonywilliams@yahoo.com");
          driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("ABCdef12");
          driver.findElement(By.cssSelector("select[name='birthday_day']")).sendKeys("27");
          driver.findElement(By.cssSelector("select[name='birthday_month']")).sendKeys("Dec");
          driver.findElement(By.cssSelector("select[name='birthday_year']")).sendKeys("1975");
          driver.findElement(By.xpath("//*[text()='Male']")).click();
          Thread.sleep(2000);
          driver.quit();

        }
    }
}
