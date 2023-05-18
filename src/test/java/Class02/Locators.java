package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        WebElement userName=chrome.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password=chrome.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement login=chrome.findElement(By.id("btnLogin"));
        login.click();


    }
}
