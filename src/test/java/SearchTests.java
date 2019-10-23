import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {
    String currentUrlSearch;

    public static final boolean testCase01 = true;
    public static final boolean testCase02 = true;
    public static final boolean testCase03 = true;
    public static final boolean testCase04 = true;

    @Test (priority = 1, enabled = testCase03, groups = {"user", "admin"})
    public void verificationsWebTestCase03(){
        Assert.assertEquals("Web", " Web");
    }

    @Test (priority = 2, enabled = testCase02, groups = {"ie"})
    public void testSearchPageTestCase02() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        //Assert.assertEquals (currentUrlSearch, Data.expectedUrlSearch);
        softAssert.assertEquals (currentUrlSearch, Data.expectedUrlSearch, "Url is wrong");
        softAssert.assertEquals (currentUrlSearch, Data.expectedUrlSearch, "Url is wrong");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_SORT_BY, "date_created");
        softAssert.assertAll();
    }

    @Test (priority = 1, enabled = testCase01, groups = {"user", "admin"})
    public void selectRandomDropDownListOnSearchPageTestCase01() {
        driver.findElement(Locators.LINK_SEARCH).click();

       int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGE);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGE, "Sort by");
            mainPage.javaWaitSec(3);
        }

    }
    //Created test case for Gifts Search button and for the text input in the search box
    @Test (priority = 4, enabled = testCase04, groups = {"user", "admin"})
    public void testSearchGiftTestCase04() {
        searchPage.SearchGift();
    }

}
