package org.espn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    // Acá irán los elementos de la página con los que necesito interactuar
    @FindBy(id = "global-user-trigger")
    private WebElement hoverOpener;
    @FindBy(xpath = "//body/div[@id='global-viewport']/div[3]/div[1]/ul[1]/li[7]/a[1]")
    private WebElement logInOpener;

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
    public void hoverOnLogIn() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(hoverOpener).perform();
        Thread.sleep(3000);
        getDriver().quit();
    }
    public void clickOnLogInOpener(){
        clickElement(logInOpener);
    }
    public boolean isLoginDisplayed(){
        return logInOpener.isDisplayed();
    }
}
