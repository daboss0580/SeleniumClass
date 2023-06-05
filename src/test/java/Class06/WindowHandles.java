package Class06;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandles extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=GB&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&dsh=S-1811260231%3A1685574748037270&emr=1&flowEntry=SignUp&flowName=GlifWebSignIn&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=Af_xneFhs30PqjQW9Ww9Myt-IRwW66rdSUNhdUqulrnpJf1xwpXC5lA5Zjmi-fSupFrj5sCqMMWRgQ&osid=1&service=mail", "chrome");
        WebElement helpBtn = driver.findElement(By.linkText("Help"));
        helpBtn.click();
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        String mainPageHandle = driver.getWindowHandle();
        System.out.println("Main page handle is : " + mainPageHandle);
        Set<String> allHandles = driver.getWindowHandles();
        for (String handles : allHandles) {
            driver.switchTo().window(handles);
            String title = driver.getTitle();
            if (title.equals("Google Account Help")) {
                break;
            }
           // System.out.println(title);
        }
        //System.out.println(driver.getTitle());
        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getTitle());
    }
}

