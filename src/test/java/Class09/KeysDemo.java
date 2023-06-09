package Class09;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class KeysDemo {
    public static class KeysDemoAct extends CommonMethods {
        public static void main(String[] args) {
            openBrowserAndLaunchApplication("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx","chrome");
            WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
            userName.sendKeys("Tester", Keys.TAB);
            WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
            password.sendKeys("test",Keys.ENTER);
        }
    }
}
