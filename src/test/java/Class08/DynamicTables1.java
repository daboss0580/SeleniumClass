package Class08;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class DynamicTables1 extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login", "chrome");
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();
        //        click on PIM
        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();
        //        print the row number of the row that has the id 56247A
        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
//        look for 56247A
        for (int i = 0; i < allIDs.size(); i++) {
            String id = allIDs.get(i).getText();
            if (id.equals("55063A")) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                System.out.println("the id is on row number " + (i + 1));
                WebElement checkBox=driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[1]"));
                checkBox.click();
            }

        }

    }


}
