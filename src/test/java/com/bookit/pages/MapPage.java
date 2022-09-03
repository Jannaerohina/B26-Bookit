package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MapPage extends BasePage {

    @FindBy(linkText = "my")
    public WebElement myLink;

    @FindBy(linkText = "self")
    public WebElement selfLink;

    public void goToSelfPage() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(myLink).perform();
        selfLink.click();

    }


}
