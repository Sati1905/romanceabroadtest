package com.romanceabroad.ui;

import org.openqa.selenium.By;

public class Locators {

    public static final By H1_TITLE = By.xpath("//h1");

    //Photos Page
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    public static final By LINK_TAB_USER_PROFILE = By.xpath("//ul[@id = 'gallery_filters']//a");
    public static final By TEXT_MEDIA_BLOCK = By.xpath("//div[@class='g-flatty-block']");
    public static final By MEDIA_CLICK_ALBUM = By.xpath("//span[@data-click='album']");
    public static final By LINK_FOOTER_TABS = By.xpath("//div[@class='footer-menu-list-group-item-text']");

    //Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text() ='Next']");
    public static final By TOOLTIP_ERROR = By.xpath("//div[@class='tooltip']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By LIST_DAYS = By.cssSelector("#daySelect");
    public static final By LIST_VALUE_DAY = By.xpath("//li[@data-handler='selectDay']");
    public static final By LIST_MONTHS = By.cssSelector("#monthSelect");
    public static final By LIST_VALUE_MONTH = By.xpath("//li[@data-handler='selectMonth']");
    public static final By LIST_YEARS = By.cssSelector("#yearSelect");
    public static final By LIST_VALUE_YEAR = By.xpath("//li[@data-handler='selectYear']");
    public static final By CHECKBOX_CONFIRMATION = By.cssSelector("input#confirmation");
    public static final By LIST_VALUE_LOCATION = By.xpath("//div[@class='dropdown dropdown_location']//ul//li");
    public static final By AUTOFILLING_FORM_LOCATION = By.xpath("//input[@name='region_name']");
    public static final By REGISTRATION_DAY_SELECT_BY_VALUE = By.xpath("//li[@data-handler='selectDay'][@data-value='2']");

    //Search page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By TEXT_FIELD_PRODUCT = By.cssSelector("input#search_product");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='pull-left pl15']//select");
    public static final By TAB_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_MAX_AGE = By.cssSelector("select#age_max");
    public static final By DROP_DOWN_MIN_AGE = By.cssSelector("select#age_min");
    public static final By BUTTON_SEARCH = By.cssSelector("#main_search_button_user_advanced");
    public static final By TEXT_USER_INFO = By.xpath("//div[@class='text-overflow']");

    //Click button
    public static final By LINK_GIFTS = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    public static final By BUTTON_SEARCH_GIFTS = By.xpath("//button[@id='search_friend']");

    //TourToUkraine Page
    public static final By LINK_TOUR_TO_UKRAINE = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");

    //Main Page
    public static final By IFRAME_YOUTUBE_VIDEO = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By BUTTON_YOUTUBE_VIDEO = By.xpath("//button[@class='ytp-large-play-button ytp-button']");

    public static final By TITLE_OF_PAGE = By.xpath("//h1");
    public static final By TAB_OF_MAIN_PAGE = By.xpath("//ul[@class='navbar-nav']//li");
    public static final By USERS_GALLERY_PHOTO = By.xpath("//a[@class='g-pic-border g-rounded']");

    //Blog Page
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINKS_OF_ARTICLES = By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//li");

    //Sign In Page
    public static final By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form'][@id='ajax_login_link']");
    public static final By BUTTON_LOGIN = By.xpath("//button[@type='submit']");
    public static final By ERROR_LOGIN = By.xpath("//div[@class='error alert-danger alert-warning_pop_']");
    public static final By FIELD_EMAIL = By.cssSelector("input[name='email']");
    public static final By FIELD_PASWORD = By.cssSelector("input[name='password']");


}



