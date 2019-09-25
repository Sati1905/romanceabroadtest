import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrlSearch;
    String currentUrlMedia;
    String currentUrlGIFTS;
    String currentUrlBlog;
    String currentUrlTOUR;
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    String expectedUrlMedia = "https://romanceabroad.com/media/index";
    String expectedUrlGIFTS = "https://romanceabroad.com/store/category-sweets";
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";
    String expectedUrlTOUR = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_MEDIA = By.cssSelector ("a[href='https://romanceabroad.com/media/index']");
    By LINK_GIFTS = By.cssSelector ("a[href='https://romanceabroad.com/store/category-sweets']");
    By LINK_SIGN_IN = By.xpath ("//a[@href= 'https://romanceabroad.com/users/login_form']");
    By LINK_BLOG = By.xpath ("//a[@href= 'https://romanceabroad.com/content/view/blog']");
    By LINK_TOUR = By.cssSelector ("a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By BUTTON_REGISTRATION = By.xpath ("//button[@id='show-registration-block']");
    By BUTTON_SEARCH_GIFTS = By.xpath ("//button[@id='search_friend']");
    int indexLinkSignIn = 0;

    @BeforeMethod
    public void setUp () {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @Test
    public void testSearchPage() {
      driver.findElement(LINK_SEARCH) .click();
      currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);
    }

    @Test
    public void testMediaPage () {
      driver.findElement(LINK_MEDIA) .click();
      currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, expectedUrlMedia);
    }

    @Test
    public void testSignIn () {
      driver.findElements(LINK_SIGN_IN).get(0).click();

    }

    @Test
    public void testRegistration () {
      driver.findElement(BUTTON_REGISTRATION).click();
      driver.findElement(By.cssSelector("input#email")).sendKeys("11@gmail.com");
      driver.findElement(By.cssSelector("input#password")).sendKeys("11@gmail.com");
      //driver.findElement(By.xpath("//button[@data-action='next-page'][text() ='Next']")).click();
    }

    //Created test case for Gifts Search button for the text input in the search box
    @Test
    public void testSearchGift () {
        driver.findElement(LINK_GIFTS) .click();
      driver.findElement(By.cssSelector("input#search_product")).sendKeys("sushi");
      driver.findElement(BUTTON_SEARCH_GIFTS).click();

    }

    // Created test case for Gifts page and used css selector
    @Test
    public void testGiftsPage() {
        driver.findElement(LINK_GIFTS) .click();
        currentUrlGIFTS = driver.getCurrentUrl();
        System.out.println(currentUrlGIFTS);
        Assert.assertEquals(currentUrlGIFTS, expectedUrlGIFTS);
    }

    // Created test case for Blog page and used xpath
    @Test
    public void testBlogPage() {
        driver.findElement(LINK_BLOG) .click();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, expectedUrlBlog);
    }
    // Created test case for Tour page and used css selector
    @Test
    public void testTourPage() {
        driver.findElement(LINK_TOUR).click();
        currentUrlTOUR = driver.getCurrentUrl();
        System.out.println(currentUrlTOUR);
        Assert.assertEquals(currentUrlTOUR, expectedUrlTOUR);
    }

    @AfterMethod
    public void afterActions () {

       // driver.quit();
    }
}

//Create variables for integers, By, String and WebElements.
//int number= 19;
//By BUTTON_SUBMIT = By.xpath("//a");
//String name = "S19";
//WebElement element = driver.findElement(By.xpath("//a"));
