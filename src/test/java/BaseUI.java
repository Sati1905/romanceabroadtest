import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://romanceabroad.com/";


    @BeforeMethod
    public void setUp () {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod
    public void afterActions () {
        // driver.quit();
    }
     //method for DropDownList
    public void getDropDownListByIndex (WebElement element, int index) {
        Select ageDropDown = new Select(element);
        ageDropDown.selectByIndex(index);
    }
    //method for clickByMouse
        public void clickByMouse (WebElement element) {
            Actions action = new Actions (driver);
            action.moveToElement(element).perform();
        }

}
