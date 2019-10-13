import org.testng.Assert;
import org.testng.annotations.Test;


public class TourToUkraineTests extends BaseUI {
    String currentUrl;

    @Test
    public void testTourToUkraine() {
        tourToUkrainePage.clickGifts();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, Data.expectedUrlSweets);
    }

}


