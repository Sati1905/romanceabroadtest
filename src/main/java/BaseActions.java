import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    //method for DropDownList
    public void getDropDownListByIndex(By locator, int index){
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(index);
    }

    public void getDropDownListByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);

    }

    public void getDropDownListByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);

    }
    public void getDropDownListByValue(By locator, String value){
        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);

    }

    //method for clickByMouse
    public void clickByMouse (WebElement element) {
        Actions action = new Actions (driver);
        action.moveToElement(element).perform();

    }
    //ajax click (doesn't work well with IE)
    public void ajaxClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript ("arguments[0].scrollIntoView(true);", element);
        wait.until (ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void ajaxClick(By by) {
        wait.until (ExpectedConditions.elementToBeClickable(by));
        ajaxClick (driver.findElement (by));
    }
    public void ajaxClick(By by, int index) {
        wait.until (ExpectedConditions.elementToBeClickable(by));
        ajaxClick (driver.findElements(by).get(index));
    }

    //click by mouse (works well with IE)
    public void performClick (By locator){
        WebElement element = driver.findElement (locator);
        Actions actions = new Actions (driver);
        actions.moveToElement (element).perform();
        actions.click().build().perform();
    }
    public void performClick (By locator, int index){
        WebElement element = driver.findElements(locator).get(index);
        Actions actions= new Actions (driver);
        actions.moveToElement (element).perform();
        actions.click().build().perform();
    }
    public void performClick (WebElement element){
        Actions actions = new Actions (driver);
        actions.moveToElement (element).perform();
        actions.click().build().perform();
    }
    public void clickUnselectedCheckbox(By checkbox) {
        WebElement currentCheckbox = driver.findElement(checkbox);
        if (!currentCheckbox.isSelected()) {
            ajaxClick(currentCheckbox);
        }
    }

    public void scrollToBottomOfPage() {
        ((JavascriptExecutor) driver).executeScript ("window.scrollTo(0,document.body.scrollHeight);");
    }
}
