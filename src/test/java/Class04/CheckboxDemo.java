package Class04;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxDemo extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-checkbox-demo.php", "chrome");
        WebElement checkbox =driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        if (!checkbox.isSelected()){
            checkbox.click();
            //        check the option-3 from the list of  check boxes
            List<WebElement> checkbox1=driver.findElements(By.xpath("//input[@class='cb1-element']"));
            for (WebElement option:checkbox1){
                String value=option.getAttribute("value");
                if (value.equals("Option-3")) {
                    option.click();
                    break;
                }
            }
        }
    }
}
