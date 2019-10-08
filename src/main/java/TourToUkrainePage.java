import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TourToUkrainePage extends BaseActions{

    public TourToUkrainePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    String currentUrl;
    public void ClickGifts(){
        driver.findElement(Locators.LINK_TOUR_TO_UKRAINE).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, Data.ExpectedUrlTourToUkraine); //why Assert is not recognized?
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.LINK_GIFTS)));
        driver.findElement(Locators.LINK_GIFTS).click();

    }
}


