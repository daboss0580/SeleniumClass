package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Tony");
        driver.findElement(By.id("customer.lastName")).sendKeys("Blinkin");
        driver.findElement(By.id("customer.address.street")).sendKeys("28 Palm Grove");
        driver.findElement(By.id("customer.address.city")).sendKeys("Walkden");
        driver.findElement(By.id("customer.address.state")).sendKeys("Manchester");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("M328ET");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("07583957399");
        driver.findElement(By.id("customer.ssn")).sendKeys("1037466373");
        driver.findElement(By.id("customer.username")).sendKeys("daboss");
        driver.findElement(By.id("customer.password")).sendKeys("734DGFjehe12!!");
        driver.findElement(By.id("repeatedPassword")).sendKeys("734DGFjehe12!!");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title =driver.getTitle();
        System.out.println(title);
        if (title.equals("ParaBank | Register for Free Online Account Access")){
            System.out.println("Title is correct");
        }else {
            System.out.println("Wrong title");
            Thread.sleep(500);
            driver.close();

        }
    }
}
