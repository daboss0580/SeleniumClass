package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.Cookie;

public class Class02HW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement cookies=driver.findElement(By.xpath("//*[text()='Allow all cookies']"));
        if (cookies.isDisplayed()){
            driver.findElement(By.xpath("//*[text()='Allow all cookies']")).click();
            Thread.sleep(1000);
        WebElement create=driver.findElement(By.xpath("//*[text()='Create new account']"));
        create.click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Baily");
        driver.findElement(By.name("lastname")).sendKeys("Clifton");
        driver.findElement(By.name("reg_email__")).sendKeys("goodboy@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("goodboy@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("ADJeyu23!!");
        driver.findElement(By.id("day")).sendKeys("25");
        driver.findElement(By.id("month")).sendKeys("Dec");
        driver.findElement(By.id("year")).sendKeys("1975");
        driver.findElement(By.xpath("//*[text()='Male']")).click();
        Thread.sleep(2000);
        driver.quit();



        }

    }
}
