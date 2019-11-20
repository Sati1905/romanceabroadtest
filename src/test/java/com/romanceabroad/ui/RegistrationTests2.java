package com.romanceabroad.ui;

import org.testng.annotations.Test;

public class RegistrationTests2 extends BaseUI {
    @Test(dataProvider = "Registration", dataProviderClass = DataProviders.class)
    public void testRegistration(String email, String password, String day,String month, String year,
                                 String phone, String city, String location) {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email,password);
        mainPage.clickNextButton();
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5), Data.phone,
                month, day, year, city, location);
    }

}
