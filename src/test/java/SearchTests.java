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
        searchPage.SearchGift();
    }

    @Test
    public void selectRandomDropDownList() {
        driver.findElement(Locators.LINK_SEARCH).click();

       int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGE);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGE, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }
}
