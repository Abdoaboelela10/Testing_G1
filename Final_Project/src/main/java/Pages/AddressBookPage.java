package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddressBookPage {
    WebDriver driver;

    public AddressBookPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private final By firstNameField = By.id("input-firstname");
    private final By lastNameField = By.id("input-lastname");
    private final By companyField = By.id("input-company");
    private final By address1Field = By.id("input-address-1");
    private final By address2Field = By.id("input-address-2");
    private final By cityField = By.id("input-city");
    private final By postCodeField = By.id("input-postcode");
    private final By countryDropdown = By.id("input-country");
    private final By regionDropdown = By.id("input-zone");
    private final By defaultAddressYes=By.xpath("//*[@id=\"content\"]/form/fieldset/div[10]/div/label[1]");
    private final By defaultAddressNo=By.xpath("//*[@id=\"content\"]/form/fieldset/div[10]/div/label[2]");
    private final By continueButton = By.cssSelector("#content > form > div > div.pull-right > input");
    private final By backButton = By.cssSelector("a.btn.btn-default");

    // Actions
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    public void enterCompany(String company)
    {
        driver.findElement(companyField).sendKeys(company);
    }

    public void enterAddress1(String address1) {
        driver.findElement(address1Field).sendKeys(address1);
    }

    public void enterAddress2(String address2) {
        driver.findElement(address2Field).sendKeys(address2);
    }

    public void enterCity(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    public void enterPostCode(String postCode) {
        driver.findElement(postCodeField).sendKeys(postCode);
    }

    public void selectCountry(String countryName) {
        Select country = new Select(driver.findElement(countryDropdown));
        country.selectByVisibleText(countryName);
    }

    public void selectRegion(String regionName) {
        Select region = new Select(driver.findElement(regionDropdown));
        region.selectByVisibleText(regionName);
    }
    public void selectDefaultAddress(Boolean IsDefault)
    {
        if (IsDefault)
        {
            driver.findElement(defaultAddressYes).click();
        }
        else
        {
            driver.findElement(defaultAddressNo).click();
        }

    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void clickBack() {
        driver.findElement(backButton).click();
    }
}
