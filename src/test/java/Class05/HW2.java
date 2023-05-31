package Class05;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW2 extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://chercher.tech/practice/frames","chrome");
        driver.switchTo().frame("frame2");
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='animals']"));
        Select select=new Select(dropDown);
        select.selectByVisibleText("Baby Cat");
        System.out.println(dropDown.getText());
        WebElement output=driver.findElement(By.xpath("//option[@value='babycat']"));
        System.out.println("The selected dropdown is: "+output.getText());
        closeBrowser();

    }

}
