import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    public void test() throws InterruptedException {
        Thread.sleep(5000);
        WebElement ele = mainPage.getElementIframe();
        mainPage.transferToIframe(ele);
        mainPage.clickIframeYoutubeVideo();
    }

    @Test
    public void test2() {
        WebElement ele = mainPage.getElementIframe();
        mainPage.activateYoutubeVideo(ele);
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


}

