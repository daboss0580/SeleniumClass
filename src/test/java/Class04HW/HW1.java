package Class04HW;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php", "chrome");
        Thread.sleep(1000);
        WebElement tuesday =driver.findElement(By.cssSelector("option[value='Tuesday']"));
        tuesday.click();
        Thread.sleep(1000);
        WebElement thursday =driver.findElement(By.cssSelector("option[value='Thursday']"));
        thursday.click();
        Thread.sleep(1000);
        WebElement friday =driver.findElement(By.cssSelector("option[value='Friday']"));
        friday.click();
        Thread.sleep(1000);
        closeBrowser();



    }
}
