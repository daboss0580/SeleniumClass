package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
       String currentURL= driver.getCurrentUrl();
        System.out.println("The current URL is "+currentURL);
        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);
        Thread.sleep(5000);
        driver.quit();


    }
}
