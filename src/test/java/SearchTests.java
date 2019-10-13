import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {
    String currentUrlSearch;


    @Test
    public void testSearchPage() {
        searchPage.clickSearch();
        currentUrlSearch = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);

    }

    //Created test case for Gifts Search button and for the text input in the search box
    @Test
    public void testSearchGift() {
        searchPage.searchgift();
    }



}
