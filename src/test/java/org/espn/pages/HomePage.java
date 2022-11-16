package org.espn.pages;

import org.espn.configuration.WebOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    //WebOperations webOperations = new WebOperations(getDriver());
    // Acá irán los elementos de la página con los que necesito interactuar
    @FindBy(id= "global-user-trigger")
    private WebElement userIcon;
    @FindBy(css = "#global-header > div.container > ul > li.user > div > div > ul.account-management > li:nth-child(7) > a")
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
    @FindBy(id = "InputLoginValue")
    private WebElement emailInput;
    @FindBy(id = "InputPassword")
    private WebElement passwordInput;
    @FindBy(css = "#global-header > div.container > ul > li.user > div > div > ul.account-management > li:nth-child(9) > a")
    private WebElement logOut;
    @FindBy(linkText = "https://www.espn.com.co/watch/?redirected=true")
    private WebElement watchPage;
    @FindBy(css = "#global-nav > ul > li.pillar.watch > a")
    private WebElement watchButton;
    @FindBy(css = ".display-user")
    private WebElement displayUser;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void mouseOverUser() {
        Actions action = new Actions(getDriver());
        action.moveToElement(userIcon).perform();
    }
    public void clickOnLogInHomePage(){
        clickElement(logInOption);
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
    public void typeEmail(String text){
        typeOnInput(emailInput, text);
    }
    public void typePassword(String text){
        typeOnInput(passwordInput, text);
    }
    public void clickOnLogInButton(){
        clickElement(logInButton);
    }
    public void getOutIframe(){
        getDriver().switchTo().defaultContent();
        super.wait.until(ExpectedConditions.invisibilityOf(iframe));
    }
    public Watch goToWatchPage(){
        clickElement(watchButton);
        return new Watch(getDriver());
    }
    public void clickOnLogOutButton(){
        clickElement(logOut);
    }
    public boolean isUsernameNotDisplayed(){
        return !displayUser.findElement(By.tagName("span")).isDisplayed();
    }
}
