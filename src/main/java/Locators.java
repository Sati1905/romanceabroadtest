import org.openqa.selenium.By;

public class Locators {

    //Media Page
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");

    //Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text() ='Next']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By REGISTRATION_DAY_SELECT_BY_ID = By.cssSelector("#daySelect");
    public static final By REGISTRATION_DAY_SELECT_BY_VALUE = By.xpath("//li[@data-handler='selectDay'][@data-value='2']");

    //Search page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By TEXT_FIELD_PRODUCT = By.cssSelector("input#search_product");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='pull-left pl15']//select");

    //Click button
    public static final By LINK_GIFTS = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    public static final By BUTTON_SEARCH_GIFTS = By.xpath("//button[@id='search_friend']");

    //Blog Page
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");

    //TourToUkraine Page
    public static final By LINK_TOUR_TO_UKRAINE = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");

    //Main Page
    public static final By IFRAME_YOUTUBE_VIDEO = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By BUTTON_YOUTUBE_VIDEO = By.xpath("//button[@class='ytp-large-play-button ytp-button']");



}



