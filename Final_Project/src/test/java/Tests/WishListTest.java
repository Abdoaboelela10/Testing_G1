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

public class WishListTest extends TestBase {

    HomePage homePage;

    @Test
   /* public void addMacbookToWishListTest() {

        homePage = new HomePage(driver);
        homePage.navigate();
        homePage.addMacbookToWishList();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".alert-success")));

        Assert.assertTrue(successAlert.getText().contains("Success: You have added MacBook to your wish list"),
                "❌ MacBook was not added to wish list successfully!");
        homePage.openWishListPage();
        homePage.AddtoCart();

    }*/
   public void addiphoneToWishListTest() {

        homePage = new HomePage(driver);
        homePage.navigate();
        homePage.addiphoneToWishList();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".alert-success")));

        Assert.assertTrue(successAlert.getText().contains("Success: You have added iPhone to your wish list"),
                "❌ iphone was not added to wish list successfully!");
                homePage.openWishListPage();
                homePage.AddtoCart();

    }
}
