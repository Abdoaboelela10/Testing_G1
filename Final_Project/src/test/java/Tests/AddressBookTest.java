package Tests;

import Base.TestBase;
import Pages.AddressBookPage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddressBookTest extends TestBase {

    HomePage homePage;
    AddressBookPage addressBookPage;

    @Test
    public void ValidAddressBook() {
        //TC_009->Register Address With Valid Data
        // Navigate to home page
        homePage = new HomePage(driver);
        homePage.navigate();
        driver.get("https://demo.opencart.com.gr/index.php?route=account/address");
        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        addressBookPage = new AddressBookPage(driver);
        addressBookPage.enterFirstName("abdo");
        addressBookPage.enterLastName("aboelela");
        addressBookPage.enterCompany("DEPI");
        addressBookPage.enterAddress1("miniya");
        addressBookPage.enterAddress2("miniya");
        addressBookPage.enterCity("Cairo");
        addressBookPage.enterPostCode("11221");
        addressBookPage.selectCountry("Egypt");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
        addressBookPage.selectRegion("Al Minya");
        addressBookPage.selectDefaultAddress(true);
        addressBookPage.clickContinue();
        //addressBookPage.clickBack();

        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
        Assert.assertTrue(successAlert.getText().contains("Your address has been successfully added"),
                "❌ Address was not added successfully!");
    }
    /*public void AddressBookWithInvalidFirstName() {
        //TC_010->Register Address With Invalid First Name
        // Navigate to home page
        homePage = new HomePage(driver);
        homePage.navigate();
        driver.get("https://demo.opencart.com.gr/index.php?route=account/address");
        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        addressBookPage = new AddressBookPage(driver);
        addressBookPage.enterFirstName("123456");
        addressBookPage.enterLastName("aboelela");
        addressBookPage.enterCompany("DEPI");
        addressBookPage.enterAddress1("miniya");
        addressBookPage.enterAddress2("miniya");
        addressBookPage.enterCity("Cairo");
        addressBookPage.enterPostCode("11221");
        addressBookPage.selectCountry("Egypt");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
        addressBookPage.selectRegion("Al Minya");
        addressBookPage.selectDefaultAddress(true);
        addressBookPage.clickContinue();
        //addressBookPage.clickBack();
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
        Assert.assertTrue(successAlert.getText().contains("Your address has been successfully added"),
                "❌ Address was not added successfully!");
    }*/
   /* public void AddressBookWithInvalidLastName() {
        //TC_011->Register Address With Invalid Last Name
        // Navigate to home page
        homePage = new HomePage(driver);
        homePage.navigate();
        driver.get("https://demo.opencart.com.gr/index.php?route=account/address");
        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        addressBookPage = new AddressBookPage(driver);
        addressBookPage.enterFirstName("abdo");
        addressBookPage.enterLastName("123456");
        addressBookPage.enterCompany("DEPI");
        addressBookPage.enterAddress1("miniya");
        addressBookPage.enterAddress2("miniya");
        addressBookPage.enterCity("Cairo");
        addressBookPage.enterPostCode("11221");
        addressBookPage.selectCountry("Egypt");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
        addressBookPage.selectRegion("Al Minya");
        addressBookPage.selectDefaultAddress(true);
        addressBookPage.clickContinue();
        //addressBookPage.clickBack();
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
        Assert.assertTrue(successAlert.getText().contains("Your address has been successfully added"),
                "❌ Address was not added successfully!");
    }*/
    /*public void AddressBookWithInvalidCompany() {
        //TC_012->Register Address With Invalid Company
        // Navigate to home page
        homePage = new HomePage(driver);
        homePage.navigate();
        driver.get("https://demo.opencart.com.gr/index.php?route=account/address");
        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        addressBookPage = new AddressBookPage(driver);
        addressBookPage.enterFirstName("abdo");
        addressBookPage.enterLastName("aboelela");
        addressBookPage.enterCompany("*#011*#");
        addressBookPage.enterAddress1("miniya");
        addressBookPage.enterAddress2("miniya");
        addressBookPage.enterCity("Cairo");
        addressBookPage.enterPostCode("11221");
        addressBookPage.selectCountry("Egypt");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
        addressBookPage.selectRegion("Al Minya");
        addressBookPage.selectDefaultAddress(true);
        addressBookPage.clickContinue();
        //addressBookPage.clickBack();
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
        Assert.assertTrue(successAlert.getText().contains("Your address has been successfully added"),
                "❌ Address was not added successfully!");
    }*/
   /* public void AddressBookWithInvalidAddress1() {
        //TC_013->Register Address With Invalid Address 1
        // Navigate to home page
        homePage = new HomePage(driver);
        homePage.navigate();
        driver.get("https://demo.opencart.com.gr/index.php?route=account/address");
        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        addressBookPage = new AddressBookPage(driver);
        addressBookPage.enterFirstName("abdo");
        addressBookPage.enterLastName("aboelela");
        addressBookPage.enterCompany("DEPI");
        addressBookPage.enterAddress1("123456");
        addressBookPage.enterAddress2("miniya");
        addressBookPage.enterCity("Cairo");
        addressBookPage.enterPostCode("11221");
        addressBookPage.selectCountry("Egypt");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
        addressBookPage.selectRegion("Al Minya");
        addressBookPage.selectDefaultAddress(true);
        addressBookPage.clickContinue();
        //addressBookPage.clickBack();
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
        Assert.assertTrue(successAlert.getText().contains("Your address has been successfully added"),
                "❌ Address was not added successfully!");
    }*/
   /* public void AddressBookWithInvalidAddress2() {
        //TC_014->Register Address With Invalid Address 2
        // Navigate to home page
        homePage = new HomePage(driver);
        homePage.navigate();
        driver.get("https://demo.opencart.com.gr/index.php?route=account/address");
        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        addressBookPage = new AddressBookPage(driver);
        addressBookPage.enterFirstName("abdo");
        addressBookPage.enterLastName("aboelela");
        addressBookPage.enterCompany("DEPI");
        addressBookPage.enterAddress1("miniya");
        addressBookPage.enterAddress2("123456");
        addressBookPage.enterCity("Cairo");
        addressBookPage.enterPostCode("11221");
        addressBookPage.selectCountry("Egypt");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
        addressBookPage.selectRegion("Al Minya");
        addressBookPage.selectDefaultAddress(true);
        addressBookPage.clickContinue();
        //addressBookPage.clickBack();
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
        Assert.assertTrue(successAlert.getText().contains("Your address has been successfully added"),
                "❌ Address was not added successfully!");
    }*/
   /* public void AddressBookWithInvalidCity() {
        //TC_015->Register Address With Invalid City
        // Navigate to home page
        homePage = new HomePage(driver);
        homePage.navigate();
        driver.get("https://demo.opencart.com.gr/index.php?route=account/address");
        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        addressBookPage = new AddressBookPage(driver);
        addressBookPage.enterFirstName("abdo");
        addressBookPage.enterLastName("aboelela");
        addressBookPage.enterCompany("DEPI");
        addressBookPage.enterAddress1("miniya");
        addressBookPage.enterAddress2("miniya");
        addressBookPage.enterCity("123456");
        addressBookPage.enterPostCode("11221");
        addressBookPage.selectCountry("Egypt");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
        addressBookPage.selectRegion("Al Minya");
        addressBookPage.selectDefaultAddress(true);
        addressBookPage.clickContinue();
        //addressBookPage.clickBack();
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
        Assert.assertTrue(successAlert.getText().contains("Your address has been successfully added"),
                "❌ Address was not added successfully!");
    }*/
    /*public void AddressBookWithInvalidPostCode() {
        //TC_016->Register Address With Invalid Post Code
        // Navigate to home page
        homePage = new HomePage(driver);
        homePage.navigate();
        driver.get("https://demo.opencart.com.gr/index.php?route=account/address");
        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        addressBookPage = new AddressBookPage(driver);
        addressBookPage.enterFirstName("abdo");
        addressBookPage.enterLastName("aboelela");
        addressBookPage.enterCompany("DEPI");
        addressBookPage.enterAddress1("miniya");
        addressBookPage.enterAddress2("miniya");
        addressBookPage.enterCity("Cairo");
        addressBookPage.enterPostCode("abcde");
        addressBookPage.selectCountry("Egypt");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
        addressBookPage.selectRegion("Al Minya");
        addressBookPage.selectDefaultAddress(true);
        addressBookPage.clickContinue();
        //addressBookPage.clickBack();
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
        Assert.assertTrue(successAlert.getText().contains("Your address has been successfully added"),
                "❌ Address was not added successfully!");
    }*/
    /*public void AddressBookWithoutCountry() {
        //TC_017->Register Address Without Country
        // Navigate to home page
        homePage = new HomePage(driver);
        homePage.navigate();
        driver.get("https://demo.opencart.com.gr/index.php?route=account/address");
        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        addressBookPage = new AddressBookPage(driver);
        addressBookPage.enterFirstName("abdo");
        addressBookPage.enterLastName("aboelela");
        addressBookPage.enterCompany("DEPI");
        addressBookPage.enterAddress1("123456");
        addressBookPage.enterAddress2("miniya");
        addressBookPage.enterCity("Cairo");
        addressBookPage.enterPostCode("11221");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
        addressBookPage.selectRegion("Al Minya");
        addressBookPage.selectDefaultAddress(true);
        addressBookPage.clickContinue();
        //addressBookPage.clickBack();
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
        Assert.assertTrue(successAlert.getText().contains("Your address has been successfully added"),
                "❌ Address was not added successfully!");
    }*/
   /* public void AddressBookWithoutRegion() {
        //TC_018->Register Address Without Region
        // Navigate to home page
        homePage = new HomePage(driver);
        homePage.navigate();
        driver.get("https://demo.opencart.com.gr/index.php?route=account/address");
        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        addressBookPage = new AddressBookPage(driver);
        addressBookPage.enterFirstName("abdo");
        addressBookPage.enterLastName("aboelela");
        addressBookPage.enterCompany("DEPI");
        addressBookPage.enterAddress1("123456");
        addressBookPage.enterAddress2("miniya");
        addressBookPage.enterCity("Cairo");
        addressBookPage.enterPostCode("11221");
        addressBookPage.selectCountry("Egypt");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
        addressBookPage.selectDefaultAddress(true);
        addressBookPage.clickContinue();
        //addressBookPage.clickBack();
        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
        Assert.assertTrue(successAlert.getText().contains("Your address has been successfully added"),
                "❌ Address was not added successfully!");
    }*/
}
