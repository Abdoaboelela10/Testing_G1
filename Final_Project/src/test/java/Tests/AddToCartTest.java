package Tests;

import Base.TestBase;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;

public class AddToCartTest extends TestBase {

    HomePage homePage;

    @Test
    public void addMacbookToCartTest() {

        homePage = new HomePage(driver);
        homePage.navigate();
        homePage.addMacbookToCart();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".alert-success")));

        Assert.assertTrue(successAlert.getText().contains("Success: You have added MacBook"),
                "❌ MacBook was not added to cart successfully!");
        homePage.openShoppingCart();
    }

   /* public void addiphoneToCartTest() {

        homePage = new HomePage(driver);
        homePage.navigate();
        homePage.addiphoneToCart();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".alert-success")));

        Assert.assertTrue(successAlert.getText().contains("Success: You have added iPhone"),
                "❌ iphone was not added to cart successfully!");
                homePage.openShoppingCart();
    }*/


}
