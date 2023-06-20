package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

 public class CommonMethods {
    public static WebDriver driver;
    public static final void openBrowserAndLaunchApplication(String url, String browser){
        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;

            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
//       maximize the window
        driver.manage().window().maximize();
        //navigate to the url
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public static final void closeBrowser(){
        if(driver!=null) {
            driver.quit();
        }
    }

    public static final void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }
    public static void singleSelectFromDropdownByText(String text, WebElement element) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void singleSelectFromDropdownByValue(String value, WebElement element) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public static void singleSelectFromDropdownByIndex(int index, WebElement element) {

        Select select = new Select(element);
        select.selectByIndex(index);

    }
}

