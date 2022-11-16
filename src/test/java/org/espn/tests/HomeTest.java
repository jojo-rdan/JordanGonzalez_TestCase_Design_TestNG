package org.espn.tests;


import org.espn.pages.Watch;
import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;

public class HomeTest extends BaseTest{
    private final String email = "chutaen4@gmail.com";
    private final String password = "Benjamin2022";

    @Test
    public void logIn() {
        checkThat("Promo banner is displayed", home.isPromoBannerDisplayed(), is(true) );
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
    @Test
    public void watch() {
        home.goToWatchPage();
        watch = new Watch(driver.getDriver());
        checkThat("At least one carousel is present", watch.atLeastOneCarouselIsDisplayed(), is(true));
        watch.clickOnSecondCardFirstCarousel();
        checkThat("X button to close is present", watch.isXButtonDisplayed(), is(true));
        watch.clickOnXButton();
        watch.previousPage();
        watch.mouseOverUser();
        checkThat("The element 'Nav text' has the right information previously\n" +
                "entered in the sign up modal: 'Welcome {{username}}!'", watch.isUsernameDisplayed(), is(true));
        watch.clickOnLogOutButton();
        watch.mouseOverUser();
        checkThat("The user has logged out successfully i.e. Validate the element 'Nav text'\n" +
                "has text: 'Welcome!' without user name specified", watch.isUsernameNotDisplayed(), is(true));
    }
}
