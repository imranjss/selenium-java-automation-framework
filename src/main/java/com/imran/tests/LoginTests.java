package com.imran.tests;

import com.imran.framework.base.BaseTest;
import com.imran.framework.pages.InventoryPage;
import com.imran.framework.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(description = "Verify user can login with valid credentials")
    public void validLoginShouldNavigateToInventory() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertTrue(inventoryPage.isInventoryPageDisplayed(),
                "Inventory page was not displayed after valid login.");
    }

    @Test(description = "Verify error message appears for invalid credentials")
    public void invalidLoginShouldShowError() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("locked_out_user", "wrong_password");

        Assert.assertTrue(loginPage.getErrorMessage().toLowerCase().contains("username and password do not match"),
                "Expected login error message was not shown.");
    }
}
