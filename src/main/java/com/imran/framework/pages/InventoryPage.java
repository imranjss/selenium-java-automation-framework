package com.imran.framework.pages;

import com.imran.framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BasePage {

    @FindBy(css = ".title")
    private WebElement inventoryTitle;

    public InventoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isInventoryPageDisplayed() {
        return isDisplayed(inventoryTitle) && "Products".equals(getText(inventoryTitle));
    }
}
