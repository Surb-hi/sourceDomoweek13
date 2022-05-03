package com.saucedemo.Testsuits;

import com.saucedemo.pages.LogIn;
import com.saucedemo.pages.Productes;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LogIn logIn=new LogIn();
    Productes productes=new Productes();
    @Test
    public void userSholdLoginSuccessfullyWithVali() throws InterruptedException {
        logIn.username("performance_glitch_user");
        logIn.password("secret_sauce");
        Thread.sleep(1000);
        logIn.clickOnLogin();
        String actualMsg="PRODUCTS";
        String expectedMsg=logIn.product();
        Assert.assertEquals(actualMsg,expectedMsg,"product does not match");
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() throws InterruptedException {
        logIn.username("performance_glitch_user");
        logIn.password("secret_sauce");
        Thread.sleep(1000);
        logIn.clickOnLogin();
        int actualMsg=6;
        int expectedMsg=productes.products();
        Assert.assertEquals(actualMsg,expectedMsg,"product is not visible");

    }
    }
