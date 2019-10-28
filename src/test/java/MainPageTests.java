import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MainPageTests extends BaseUI {
    String currentUrlMedia;

    @Test
    public void testMediaPage() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_MEDIA));
        driver.findElement(Locators.LINK_MEDIA).click();
        mainPage.javaWaitSec(5);
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
    }


    @Test
    public void validateAssertions() {
        Assert.assertEquals("Web", "Web");
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isDisplayed(), " Element is not displayed");
        boolean requirement = true;
        Assert.assertTrue(requirement);
        //Assert.fail("Element is not displayed");

        mainPage.javaWaitSec(5);
    }

    @Test
    public void testLinksOnMainPage() {
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
        driver.findElement(Locators.LINK_SEARCH);
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
    }

    @Test
    public void smokeTestMainPage (){
        List <WebElement> mainTabs =driver.findElements(By.xpath("//ul[@class='navbar-nav']//li/a"));
        for (int i = 0; i <mainTabs.size() ; i++) {
            mainTabs.get(i).click();
            driver.get(Data.mainUrl);
            mainTabs = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li/a"));

            
        }
    } 

}

