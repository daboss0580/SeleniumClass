package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url, String browser){
        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;

            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
//       maximize thhe window
        driver.manage().window().maximize();
        //navigate to the url
        driver.get(url);
        driver.manage().window().maximize();
    }
    public static void closeBrowser(){
        if(driver!=null) {
            driver.quit();
        }
    }
}
