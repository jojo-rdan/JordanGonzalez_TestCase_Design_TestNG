package org.espn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Watch extends BasePage {
    @FindBy(css = "section.Carousel")
    private List<WebElement> carouselList;
    @FindBy(css = ".lightbox__closebtn")
    private WebElement xButton;
    @FindBy(id= "global-user-trigger")
    private WebElement userIcon;
    @FindBy(css = ".display-user")
    private WebElement displayUser;
    @FindBy(css = "#global-header > div.container > ul > li.user > div > div > ul.account-management > li:nth-child(9) > a")
    private WebElement logOut;
    @FindBy(css = ".BucketsContainer > div:nth-child(1) > section > div:nth-child(2) > div > div > ul > li:nth-child(2)")
    private WebElement secondCardOnFirstCarousel;

    public Watch(WebDriver driver) {super(driver);}
    public List<WebElement> getCarouselElements(){
        return carouselList.get(0).findElements(By.cssSelector("ul.Carousel__Inner li"));
    }
    public boolean atLeastOneCarouselIsDisplayed(){
        waitForElements(By.cssSelector("ul.Carousel__Inner li"));
        return carouselList.size() > 0;
    }
    public void clickOnSecondCardFirstCarousel(){
        clickElement(secondCardOnFirstCarousel);
    }
    public boolean isXButtonDisplayed(){
        return secondCardOnFirstCarousel.findElement(By.className("lightbox__closebtn")).isDisplayed();
    }
    public void clickOnXButton(){
        clickElement(xButton);
    }
    public void previousPage(){
        getDriver().navigate().back();
    }
    public void mouseOverUser() {
        Actions action = new Actions(getDriver());
        action.moveToElement(userIcon).perform();
    }
    public boolean isUsernameDisplayed(){
        return displayUser.findElement(By.tagName("span")).isDisplayed();
    }
    public void clickOnLogOutButton(){
        clickElement(logOut);
    }
    public boolean isUsernameNotDisplayed(){
        return !displayUser.findElement(By.tagName("span")).isDisplayed();
    }
}
