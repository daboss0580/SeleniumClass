package Class04;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioBottons1 extends CommonMethods {
    public static void main(String[] args) {
openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-radiobutton-demo.php","chrome");
List<WebElement> ageGroup =driver.findElements(By.xpath("//input[@name='ageGroup']"));
// u need to select the option specified by user
            String option ="5 - 15";

            for(WebElement age:ageGroup){

                    String value = age.getAttribute("value");
                    if(value.equals(option)){
                            age.click();
                            break;
                    }
            }

    }
}
