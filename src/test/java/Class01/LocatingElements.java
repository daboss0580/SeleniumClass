package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("carriage@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("532647327837");
        String url= driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        if (title.equals("Facebook – log in or sign up")){
            System.out.println("Title is correct");
        }else {
            System.out.println("Wrong title");
        }
        driver.quit();
    }
}
