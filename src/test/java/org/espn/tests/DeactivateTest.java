package org.espn.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.hamcrest.core.Is.is;
public class DeactivateTest extends BaseTest{
    private final String email = "chutaen6@gmail.com";
    private final String password = "Benjamin2022";

    @BeforeTest
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
    public void deactivateAccount(){
        home.mouseOverUser();
        home.clickOnESPNProfileHomePage();
        home.goToIframe();
        home.clickOnDeleteAccountButton();
        checkThat("The element is unique", home.isAnUniqueElement(), is(true));
        home.clickOnDeleteAccountConfirmation();
        checkThat("The element is unique", home.isAnUniqueElementAgain(), is(true));
        home.clickOnOkButton();
        home.getOutIframe();
        home.mouseOverUser();
        home.clickOnLogInHomePage();
        home.goToIframe();
        home.typeEmail(email);
        home.typePassword(password);
        home.clickOnLogInButton();
        checkThat("The account is deactivated", home.isTheAccountDeactivated(), is(true));
    }
}
