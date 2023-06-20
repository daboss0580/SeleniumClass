package TestNg;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParameterExamples extends CommonMethods{
    @BeforeClass
    void setup(){
        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login","chrome");
    }
    @Test(priority = 1)
    void logoTest(){
        WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo not displayed");
    }
    @Test(priority = 2)
    void homepageTitle(){
        String title=driver.getTitle();
        Assert.assertEquals("Human Management System",title,"Title not matched");
    }
    @AfterClass
    void end(){
        closeBrowser();
    }
}
