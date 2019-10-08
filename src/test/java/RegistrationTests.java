
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistration() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(Data.nickname);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        driver.findElement(By.cssSelector("#daySelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectDay'][@data-value='2']")).click();

    }

    @Test
    public void secondRegistration(){
        driver.get("https://romanceabroad.com/users/registration/");
        getDropDownListByValue(driver.findElement(By.xpath("//select[@class='form-control']")),"3");

    }
}



