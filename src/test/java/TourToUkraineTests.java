import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TourToUkraineTests extends BaseUI {
    String currentUrl;

    @Test
    public void testTouToUkraine() {
        driver.findElement(Locators.LINK_TOUR_TO_UKRAINE).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, Data.ExpectedUrlTourToUkraine);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.LINK_GIFTS)));
        driver.findElement(Locators.LINK_GIFTS).click();
    }

}


