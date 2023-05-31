package Class05;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Frames extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://chercher.tech/practice/frames", "chrome");
        driver.switchTo().frame(1);
        WebElement animal=driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());
        WebElement find=driver.findElement(By.xpath("//select[@id='animals']"));
        Select select=new Select(find);
        select.selectByVisibleText("Baby Cat");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Kingsley");
        WebElement checkbox=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(checkbox);
        driver.findElement(By.id("a")).click();

    }
}
