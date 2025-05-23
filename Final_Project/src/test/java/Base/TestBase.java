package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void preconditions() {
            driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
  /* @AfterClass
    public void tearDown() {
        driver.quit();
    }*/




}
