import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests extends BaseUI {

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
    }
}