package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void navigate() {
        driver.get("https://demo.opencart.com.gr/index.php?route=common/home");
    }

    // Locators
    private final By MyAccountDropdown = By.cssSelector("a[title='My Account']");
    private final By Register_Button = By.xpath("//a[text()='Register']");

    private final By macbookAddToCart = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[1]");
    private final By macbookAddToWishList=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]");
    private final By iphoneAddToCart=By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]");
    private final By iphoneAddToWishList=By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[2]");
    private final By AddToCart=By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[6]/button");
    public void clickRegister() {
        driver.findElement(MyAccountDropdown).click(); // الأول نفتح الـ dropdown
        driver.findElement(Register_Button).click(); // بعدين نضغط Register
    }

    public void addMacbookToCart() {
        driver.findElement(macbookAddToCart).click();
    }
    public void addMacbookToWishList()
    {
        driver.findElement(macbookAddToWishList).click();
    }
    public void addiphoneToCart()
    {
        driver.findElement(iphoneAddToCart).click();
    }
    public void addiphoneToWishList()
    {
        driver.findElement(iphoneAddToWishList).click();
    }
    public void openWishListPage() {
        driver.get("https://demo.opencart.com.gr/index.php?route=account/wishlist");
    }
    public void openShoppingCart()
    {
        driver.get("https://demo.opencart.com.gr/index.php?route=checkout/cart");
    }
    public void AddtoCart()
    {
        driver.findElement(AddToCart).click();
    }
}
