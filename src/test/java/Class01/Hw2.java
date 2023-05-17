package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver chrome=new ChromeDriver();
        chrome.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        chrome.manage().window().maximize();
        chrome.findElement(By.id("ctl00_MainContent_username")).sendKeys("kelly1234");
        chrome.findElement(By.id("ctl00_MainContent_password")).sendKeys("kelly1234");
        String url=chrome.getCurrentUrl();
        System.out.println(url);
        String title =chrome.getTitle();
        System.out.println(title);
        if (title.equals("Web Orders Login")){
            System.out.println("Title is correct");
        }else {
            System.out.println("Wrong title");
            Thread.sleep(1000);
            chrome.close();

        }
    }
}
