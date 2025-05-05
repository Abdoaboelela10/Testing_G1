package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;


public class RegisterPage {
    WebDriver driver;

    // Locators
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By privacyPolicy = By.name("agree");
    By registerButton = By.cssSelector("input[value='Continue']");
    By newsletterYes = By.xpath("//input[@name='newsletter' and @value='1']");
    By newsletterNo = By.xpath("//input[@name='newsletter' and @value='0']");


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    public void enterLastName(String name) {
        driver.findElement(lastName).sendKeys(name);
    }

    public void enterEmail(String userEmail) {
        driver.findElement(email).sendKeys(userEmail);
    }

    public void enterTelephone(String userTelephone) {
        driver.findElement(telephone).sendKeys(userTelephone);
    }

    public void enterPassword(String userPassword) {
        driver.findElement(password).sendKeys(userPassword);
    }

    public void enterConfirmPassword(String userPassword) {
        driver.findElement(confirmPassword).sendKeys(userPassword);
    }

    public void checkPrivacyPolicy() {
        driver.findElement(privacyPolicy).click();
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }
    public void selectNewsletter(boolean subscribe) {
        if (subscribe)
        {
            driver.findElement(newsletterYes).click();
        }
        else
        {
            driver.findElement(newsletterNo).click();
        }
    }

}
