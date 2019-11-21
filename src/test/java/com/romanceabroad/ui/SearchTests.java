package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests extends BaseUI {
    String currentUrlSearch;

    public static final boolean testCase11 = true;
    public static final boolean testCase12 = true;
    public static final boolean testCase13 = true;


    @Test(priority = 2, enabled = testCase12, groups = {"ie"})
    public void testSearchPageTestCase12() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        searchPage.clickPrettyWomen();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        //Assert.assertEquals (currentUrlSearch, com.romanceabroad.ui.Data.expectedUrlSearch);
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "Url is wrong");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_SORT_BY, "date_created");
        softAssert.assertAll();
    }

    @Test(priority = 1, enabled = testCase11, groups = {"user", "admin"})
    public void selectRandomDropDownListOnSearchPageTestCase11() {
        searchPage.clickPrettyWomen();

        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGE);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGE, "Sort by");
            mainPage.javaWaitSec(3);
        }

    }

    @Test(dataProvider = "Search", dataProviderClass = DataProviders.class, priority = 3, enabled = testCase13, groups = {"user", "admin"})
    public void searchDifferentResults13(String minAge, String maxAge, String sortBy) {
        int min = Integer.parseInt(minAge);
        int max = Integer.parseInt(maxAge);

        searchPage.clickPrettyWomen();
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_MIN_AGE), minAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_MAX_AGE), maxAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY), sortBy);
        searchPage.clickSearchButton();

        List<WebElement> infoAboutUser = driver.findElements(Locators.TEXT_USER_INFO);
        for (int i = 0; i < infoAboutUser.size(); i++) {
            if (i % 2 == 0) {
                WebElement text = infoAboutUser.get(i);
                String info = text.getText();
                String[] splitedPhrase = info.split(", ");
                String age = splitedPhrase[1];
                int ageNum = Integer.parseInt(age);

                if (min <= ageNum || ageNum <= max) {
                    System.out.println("This age: " + ageNum + " is correct");
                } else {
                    Assert.fail("Wrong age: " + ageNum);
                }
            }
            mainPage.javaWaitSec(3);
            infoAboutUser = driver.findElements(Locators.TEXT_USER_INFO);
        }

    }


}


