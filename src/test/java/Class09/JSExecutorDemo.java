package Class09;

import Utilities.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.idealized.Javascript;

import java.io.File;
import java.io.IOException;

public class JSExecutorDemo extends CommonMethods {
    public static void main(String[] args) throws InterruptedException, IOException {
        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login","chrome");
        //        find the text box
        WebElement userNameTxtBox = driver.findElement(By.xpath("//input[@id='txtUsername']"));

//        JSExecutor
        JavascriptExecutor js= (JavascriptExecutor) driver;
//        script
//        the script should draw a border around the WebElement
        TakesScreenshot ts=(TakesScreenshot)driver;

        js.executeScript("arguments[0].style.backgroundColor='green'",userNameTxtBox);
        File ss=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss,new File("C:\\Users\\reach\\IdeaProjects\\SeleniumClass\\Screenshots\\Multi1.jpg"));
        js.executeScript("arguments[0].style.border='2px solid red'",userNameTxtBox);
        File ss1=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss1,new File("C:\\Users\\reach\\IdeaProjects\\SeleniumClass\\Screenshots\\Multi2.jpg"));
        js.executeScript("arguments[0].style.border='5px solid blue'",userNameTxtBox);
        File ss2=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss2,new File("C:\\Users\\reach\\IdeaProjects\\SeleniumClass\\Screenshots\\Multi3.jpg"));
        closeBrowser();


    }
}
