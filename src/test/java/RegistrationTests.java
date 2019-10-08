import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistration() {
        mainPage.clickJoinButton();
        mainPage.completeRegistration();

    }

    @Test
    public void secondRegistration(){
        driver.get("https://romanceabroad.com/users/registration/");
        getDropDownListByValue(driver.findElement(By.xpath("//select[@class='form-control']")),"3");

    }

}



