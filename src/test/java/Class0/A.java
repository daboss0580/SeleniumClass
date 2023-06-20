package Class0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
    public static void main(String[] args) {
        WebDriver drive=new ChromeDriver();
        drive.navigate().to("https://www.amazon.com");
    }
}
