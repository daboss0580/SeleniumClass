package Class04;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdown extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php", "chrome");
        //        is to select multiple options from multi select DRopDOWn
//        Approach

//        1. inspect and find the element that has the dropdown
        WebElement DD = driver.findElement(By.xpath("//select[@name='States']"));
//        2.create an object of the select class and pass in the parameters the element dropdown
        Select sel=new Select(DD);

//        check if the dropdown  multiselect
        boolean isMul = sel.isMultiple();
        System.out.println("the drop down is multi select :"+isMul);
        sel.selectByVisibleText("California");
        sel.selectByValue("New Jersey");
        sel.selectByIndex(6);
        Thread.sleep(1000);
        sel.deselectByVisibleText("California");
        sel.deselectByValue("New Jersey");
        sel.deselectByIndex(6);
        closeBrowser();

    }
}
