package Class04;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioBottons extends CommonMethods {
    public static void main(String[] args) {
openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-radiobutton-demo.php","chrome");
        WebElement radioGender=driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        radioGender.click();
        //        check if the radio button r1 is selected
        boolean r1isSelected = radioGender.isSelected();
        System.out.println("the radio button Male is selected :"+r1isSelected);
        //        check if the radio button is displayed
        boolean r1isDisplayed = radioGender.isDisplayed();
        System.out.println("the radio button Male is displayed : "+r1isDisplayed);
        //        check if the radio button r1 is enabled
        boolean r1isEnabled = radioGender.isEnabled();
        System.out.println("the radio button Male is enabled :"+r1isEnabled);
        WebElement radioGender1=driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        radioGender1.click();
        r1isSelected = radioGender1.isSelected();
        System.out.println("the radio button Male is selected :"+r1isSelected);
    }
}
