package Class09;

import Utilities.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) throws InterruptedException, IOException {
        openBrowserAndLaunchApplication("https://the-internet.herokuapp.com/","chrome");

        WebElement fileUpload=driver.findElement(By.xpath("//a[text()='File Upload']"));
        fileUpload.click();
        //        find the element which u can click to upload the file
        WebElement fileUploadBtn = driver.findElement(By.xpath("//input[@id='file-upload']"));
//in order to send/upload the file
//   u can send the path of that file in sendKEys.
//        the file path willbe different for everyone depending on their own system
        fileUploadBtn.sendKeys("C:\\Users\\reach\\Desktop\\Ass1.png");
        TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
        File ss=takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss,new File("C:\\Users\\reach\\IdeaProjects\\SeleniumClass\\Screenshots\\jUpload.png"));
        WebElement submit=driver.findElement(By.xpath("//input[@id='file-submit']"));
        submit.click();
        closeBrowser();

    }

}
