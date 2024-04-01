package stepDefinitions;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import pages.BasePage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US_001_Step extends BasePage {


    @Given("The User Starts Muslim_Ramadan App")
    public void the_user_starts_muslim_ramadan_app() {
        Driver.getAndroidDriver();
    }

    @Given("The user clicks on the {string} button")
    public void the_user_clicks_on_the_login_button(String element) throws InterruptedException {
        try {if (us001Page.getLoginPageLoginButton().isDisplayed()) {return;}} catch (Exception e) {}
        switch (element) {
            case "Continue":
                us002Page.clickButtonUs02(element);
                break;
            case "login":
                us001Page.clickButtonUs01(element);
                break;
            case "Continue with Email":
                us003Page.clickButtonUs03(element);
        }
        ReusableMethods.wait(2);
    }

    @Given("Fills the user mail information as {string}")
    public void fills_the_user_mail_information_as(String mail) {
        us001Page.userMailTexBoxWrite(ConfigReader.getProperty(mail));
    }

    @Given("Fills the user password information as {string}")
    public void fills_the_user_password_information_as(String password) {
        us001Page.userPassTexBoxWrite(ConfigReader.getProperty(password));
    }

    @Given("The User Clicks {string} Button In Login Page")
    public void the_user_clicks_login_button_in_login_page(String element) throws InterruptedException {
        us001Page.clickButtonUs01(element);
        ReusableMethods.wait(2);
    }

    @Given("Successful login is verified")
    public void successful_login_is_verified() {
        assertTrue(us001Page.getMyProfileText().isDisplayed());
    }

    @Given("It is verified that the account cannot be logged in")
    public void It_is_verified_that_the_account_cannot_be_logged_in() {
        assertTrue(us001Page.getInvalidPasswordText().isDisplayed());
        ReusableMethods.wait(2);
    }

    @Given("User closes the app")
    public void User_closes_the_app() {
        Driver.getAndroidDriver().quit();
    }


}
