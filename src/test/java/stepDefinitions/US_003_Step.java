package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.BasePage;
import utils.ConfigReader;

public class US_003_Step extends BasePage {

    @Given("The user fills the {string}, {string}, {string} and click on Register button")
    public void the_user_fills_the_and_click_on_register_button(String name, String mail, String password) throws InterruptedException {
        us003Page.register(ConfigReader.getProperty(name),ConfigReader.getProperty(mail),ConfigReader.getProperty(password));
    }
}
