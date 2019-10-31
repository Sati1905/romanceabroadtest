package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BaseActions{

    public SearchPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    //Test1
    String currentUrlSearch;
    public void clickSearch() {
        driver.findElement(Locators.LINK_SEARCH).click();

        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);

        getDropDownListByValue(Locators.DROP_DOWN_LIST_SORT_BY, "date_created");
    }


    //Test2
    public void searchGift(){
        driver.findElement(Locators.LINK_GIFTS).click();
        driver.findElement(Locators.TEXT_FIELD_PRODUCT).sendKeys(Data.product);
        driver.findElement(Locators.BUTTON_SEARCH_GIFTS).click();
    }

    public void clickPrettyWomen(){
        driver.findElement(Locators.LINK_SEARCH).click();
    }

    public void clickSearchButton(){
        driver.findElement(Locators.BUTTON_SEARCH).click();
    }
}


