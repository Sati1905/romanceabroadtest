import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

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
    public void SearchGift(){
        driver.findElement(Locators.LINK_GIFTS).click();
        driver.findElement(Locators.TEXT_FIELD_PRODUCT).sendKeys(Data.product);
        driver.findElement(Locators.BUTTON_SEARCH_GIFTS).click();
    }

}


