import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {
    String currentUrlSearch;


    @Test
    public void testSearchPage() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
    }

    //Created test case for Gifts Search button and for the text input in the search box
    @Test
    public void testSearchGift(){
        driver.findElement(Locators.LINK_GIFTS).click();
        driver.findElement(Locators.TEXT_FIELD_PRODUCT).sendKeys(Data.product);
        driver.findElement(Locators.BUTTON_SEARCH_GIFTS).click();

    }


    }
