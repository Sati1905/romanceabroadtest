import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions{

    public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

        public void clickJoinButton(){
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
      }

         public void completeRegistration(){

          driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
          driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
          driver.findElement(Locators.BUTTON_NEXT).click();
          driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(Data.nickname);
          driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
          driver.findElement(Locators.REGISTRATION_DAY_SELECT_BY_ID).click();
          driver.findElement(Locators.REGISTRATION_DAY_SELECT_BY_VALUE).click();

      }

      public WebElement getElementIframe(){
        WebElement element = driver.findElement(Locators.IFRAME_YOUTUBE_VIDEO);
        return element;

    }

    public void clickIframeYoutubeVideo(){
        driver.findElement(Locators.BUTTON_YOUTUBE_VIDEO).click();
    }

    public void transferToIframe(WebElement ele){
        driver.switchTo().frame(ele);
    }

    public void activateYoutubeVideo(WebElement element){
        getElementIframe();
        transferToIframe(element);
        clickIframeYoutubeVideo();

    }
}


