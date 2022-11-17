package org.espn.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;

public class LogOutTest extends BaseTest{
    private final String email = "chutaen6@gmail.com";
    private final String password = "Benjamin2022";

    @BeforeMethod
    public void setUpPreviousLogIn(){
        checkThat("Promo banner is displayed", home.isPromoBannerDisplayed(), is(true) );
        home.mouseOverUser();
        home.clickOnLogInHomePage();
        home.goToIframe();
        home.typeEmail(email);
        home.typePassword(password);
        home.clickOnLogInButton();
        home.getOutIframe();
    }
    @Test
    public void LogOut(){
        home.mouseOverUser();
        home.clickOnLogOutButton();
        checkThat("Validate session is log out from user panel", home.isUsernameNotDisplayed(), is(true));
    }
}
