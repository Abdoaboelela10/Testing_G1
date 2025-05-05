package Tests;

import Base.TestBase;
import Pages.HomePage;
import Pages.RegisterPage;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase
{
    HomePage homePage;
    RegisterPage registerPage;

    @Description("Validate Success of registering a new user to the system")
    @Test

    public void ValidRegister()
    {
        //TC_01->Register with valid data
        homePage=new HomePage(driver);
        registerPage = new RegisterPage(driver); // لو عندك Constructor بياخد Driver
        homePage.navigate();
        homePage.clickRegister();
        registerPage.enterFirstName("abdo");
        registerPage.enterLastName("mohamed");
        registerPage.enterEmail("abdo" + System.currentTimeMillis() + "@gmail.com"); // ايميل مختلف كل مرة
        registerPage.enterTelephone("01012345678");
        registerPage.enterPassword("Test@1234");
        registerPage.enterConfirmPassword("Test@1234");
        registerPage.selectNewsletter(true); // أو false لو مش عايز يشترك
        registerPage.checkPrivacyPolicy();

        registerPage.clickRegister();

    }

   /* public void RegisterWithInvalidFirstName()
    {
        //TC_02->Register with invalid First Name
        homePage=new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        homePage.clickRegister();
        registerPage.enterFirstName("123456");
        registerPage.enterLastName("mohamed");
        registerPage.enterEmail("abdo" + System.currentTimeMillis() + "@gmail.com"); // ايميل مختلف كل مرة
        registerPage.enterTelephone("01012345678");
        registerPage.enterPassword("Test@1234");
        registerPage.enterConfirmPassword("Test@1234");
        registerPage.selectNewsletter(true); // أو false لو مش عايز يشترك
        registerPage.checkPrivacyPolicy();

        //registerPage.clickRegister();
    }*/
   /* public void RegisterWithInvalidLasName()
    {
        //TC_03->Register with invalid Last Name
        homePage=new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        homePage.clickRegister();
        registerPage.enterFirstName("abdo");
        registerPage.enterLastName("123456");
        registerPage.enterEmail("abdo" + System.currentTimeMillis() + "@gmail.com"); // ايميل مختلف كل مرة
        registerPage.enterTelephone("01012345678");
        registerPage.enterPassword("Test@1234");
        registerPage.enterConfirmPassword("Test@1234");
        registerPage.selectNewsletter(true); // أو false لو مش عايز يشترك
        registerPage.checkPrivacyPolicy();

        //registerPage.clickRegister();
    }*/
   /* public void RegisterWithInvalidEmail()
    {
        //TC_04->Register with invalid Email
        homePage=new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        homePage.clickRegister();
        registerPage.enterFirstName("abdo");
        registerPage.enterLastName("mohamed");
        registerPage.enterEmail("#" + System.currentTimeMillis() + "@gmail.com"); // ايميل مختلف كل مرة
        registerPage.enterTelephone("01012345678");
        registerPage.enterPassword("Test@1234");
        registerPage.enterConfirmPassword("Test@1234");
        registerPage.selectNewsletter(true); // أو false لو مش عايز يشترك
        registerPage.checkPrivacyPolicy();

        //registerPage.clickRegister();
    }*/
   /* public void RegisterWithInvalidTelephone()
    {
        //TC_05->Register with invalid Telephone
        homePage=new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        homePage.clickRegister();
        registerPage.enterFirstName("abdo");
        registerPage.enterLastName("mohamed");
        registerPage.enterEmail("abdo" + System.currentTimeMillis() + "@gmail.com"); // ايميل مختلف كل مرة
        registerPage.enterTelephone("abdo");
        registerPage.enterPassword("Test@1234");
        registerPage.enterConfirmPassword("Test@1234");
        registerPage.selectNewsletter(true); // أو false لو مش عايز يشترك
        registerPage.checkPrivacyPolicy();

        //registerPage.clickRegister();
    }*/
    /*public void RegisterWithValidPassword()
    {
        //TC_06->Register with Valid Password &Passwoed between 4and 20 charchter
        homePage=new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        homePage.clickRegister();
        registerPage.enterFirstName("abdo");
        registerPage.enterLastName("mohamed");
        registerPage.enterEmail("abdo" + System.currentTimeMillis() + "@gmail.com"); // ايميل مختلف كل مرة
        registerPage.enterTelephone("01012345678");
        registerPage.enterPassword("Test@1234");
        registerPage.enterConfirmPassword("Test@1234");
        registerPage.selectNewsletter(true); // أو false لو مش عايز يشترك
        registerPage.checkPrivacyPolicy();

        //registerPage.clickRegister();
    }*/
    /*public void RegisterWithInvalidConfirmPassword()
    {
        //TC_07->Register With Valid data But ConfirmPassword don't same Password
        homePage=new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        homePage.clickRegister();
        registerPage.enterFirstName("abdo");
        registerPage.enterLastName("mohamed");
        registerPage.enterEmail("abdo" + System.currentTimeMillis() + "@gmail.com"); // ايميل مختلف كل مرة
        registerPage.enterTelephone("01012345678");
        registerPage.enterPassword("Test@1234");
        registerPage.enterConfirmPassword("abcd");
        registerPage.checkPrivacyPolicy();
        registerPage.selectNewsletter(true); // أو false لو مش عايز يشترك
        registerPage.clickRegister();
    }*/
   /* public void RegisterWithInvalidPassword()
    {
        //TC_02->Register with invalid Password &Passwoed more than 20 charchter
        homePage=new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        homePage.clickRegister();
        registerPage.enterFirstName("abdo");
        registerPage.enterLastName("mohamed");
        registerPage.enterEmail("abdo" + System.currentTimeMillis() + "@gmail.com"); // ايميل مختلف كل مرة
        registerPage.enterTelephone("01012345678");
        registerPage.enterPassword("abcdefghigk123456789147852369");
        registerPage.enterConfirmPassword("abcdefghigk123456789147852369");
        registerPage.selectNewsletter(true); // أو false لو مش عايز يشترك
        registerPage.checkPrivacyPolicy();

        //registerPage.clickRegister();
    }*/


}
