package org.espn.pages;

import org.espn.configuration.WebOperations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    WebOperations webOperations = new WebOperations(getDriver());
    // Acá irán los elementos de la página con los que necesito interactuar
    @FindBy(id= "global-user-trigger")
    private WebElement userIcon;

    @FindBy(id = "global-header > div.container > ul > li.user > div > div > ul.account-management > li:nth-child(7) > a")
    private WebElement logInOption;

    @FindBy(id = "oneid-iframe")
    private WebElement iframe;
    @FindBy(css = "#root > div:nth-child(3) > div > div > div:nth-child(1) > form")
    private WebElement logInModal;
    @FindBy(id = "logo")
    private WebElement logo;

    @FindBy(id = "BtnSubmit")
    private WebElement logInButton;

    @FindBy(id = "BtnCreateAccount")
    private WebElement signUpButton;
    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }


    // Métodos que harán lo que yo quiero
    public void mouseOverUser() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(userIcon).perform();
        Thread.sleep(3000);
        getDriver().quit();
    }
    public void clickOnLogInHomePage(){
        webOperations.clickElement(logInOption);
    }
    public void goToIframe() {
        getDriver().switchTo().frame(iframe);
    }
    public boolean isLogInModalDisplayed(){
        return logInModal.isDisplayed();
    }
    public boolean isLogoDisplayed(){
        return logo.isDisplayed();
    }
    public boolean isLogInDisplayed(){
        return logInButton.isDisplayed();
    }
    public boolean isSignUpDisplayed(){
        return signUpButton.isDisplayed();
    }
    public void typeEmail(){

    }
}
