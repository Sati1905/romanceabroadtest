import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI {
    String currentUrlMedia;


    @Test
    public void testMediaPage() {
        mediaPage.navigateToMediaPage();
        currentUrlMedia = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
    }
}



