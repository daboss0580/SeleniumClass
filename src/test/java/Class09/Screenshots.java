package Class09;

import Utilities.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class Screenshots extends CommonMethods {
    public static void main(String[] args) throws IOException {
        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login", "chrome");

        WebElement login = driver.findElement(By.id("btnLogin"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",login);
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File screenshot=takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("C:\\Users\\reach\\IdeaProjects\\SeleniumClass\\Screenshots\\Justin.jpg"));

    }
}
