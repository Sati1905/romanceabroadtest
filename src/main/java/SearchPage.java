import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BaseActions{

    public SearchPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    //Test1
    String currentUrlSearch;
    public void clickSearch(){
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch); //why Assert is not recognized?
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select= new Select (driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByValue("date_created");
    }

    //Test2
    public void Searchgift(){
        driver.findElement(Locators.LINK_GIFTS).click();
        driver.findElement(Locators.TEXT_FIELD_PRODUCT).sendKeys(Data.product);
        driver.findElement(Locators.BUTTON_SEARCH_GIFTS).click();
    }

}


