package org.espn.tests;


import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;

public class HomeTest extends BaseTest{
    private final String email = "chutaen@gmail.com";
    private final String password = "Benjamin2022";

    @Test
    public void LogIn() {
        home.mouseOverUser();
        home.clickOnLogInHomePage();
        home.goToIframe();
        checkThat("Log In modal is available", home.isLogInModalDisplayed(), is(true));
        checkThat("ESPN logo is available", home.isLogoDisplayed(), is(true));
        checkThat("Log In button is available", home.isLogInDisplayed(), is(true));
        checkThat("Sign Up button is available", home.isSignUpDisplayed(), is(true));
        home.typeEmail(email);
        home.typePassword(password);
        home.clickOnLogInButton();
        home.getOutIframe();
    }
}
