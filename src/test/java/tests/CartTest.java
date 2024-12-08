package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void checkCart() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.clickAddButton("Sauce Labs Backpack");
        cartPage.open();
        Assert.assertTrue(
                cartPage.isProductInCart("Sauce Labs Backpack"),
                "SO BAD");

        Assert.assertEquals(cartPage.getProductNameFromCart(0),
                "Sauce Labs Backpack",
                "SO BAD");

        Assert.assertTrue(
                cartPage.getProductsName().contains("Sauce Labs Backpack"),
                "SO BAD");
    }
}
