package com.romanceabroad.ui;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class SignInTests extends BaseUI {

    //Negative Test for SignIn page
    @Test(dataProvider = "SignIn", dataProviderClass = DataProviders.class)
    public void testSignIn (String email, String password, boolean requirement) {
        driver.findElement(Locators.LINK_SIGN_IN).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.FIELD_EMAIL)));
        driver.findElement(Locators.FIELD_EMAIL).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.FIELD_PASWORD)));
        driver.findElement(Locators.FIELD_PASWORD).sendKeys(Data.wrongpassword);
        driver.findElement(Locators.BUTTON_LOGIN).click();
        if (!requirement) {
            Assert.assertFalse(driver.findElement(Locators.ERROR_LOGIN).isDisplayed());
            System.out.println("Login is not successful!");
        } else {
            System.out.println("Login is successful!");

        }
    }
}





