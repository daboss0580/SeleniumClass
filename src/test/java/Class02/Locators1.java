package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators1 {
    public static void main(String[] args) {
        WebDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://www.amazon.com/");
        List<WebElement>allLinks=chrome.findElements(By.tagName("a"));
        for (WebElement link:allLinks){
           String linkOfWebsite = link.getAttribute("href");
            System.out.println(linkOfWebsite);


        }
    }
}
