package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.BasePage;
import pages.US_002_Page;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US_002_Step extends BasePage {


    @Given("The user clicks on the back button")
    public void the_user_clicks_on_the_back_button() throws InterruptedException {
        ReusableMethods.pressCoordinate(112, 143, 1000);
    }

    @Given("Allow automatic locate selection and click {string}")
    public void allow_automatic_locate_selection_and_click_continue(String element) throws InterruptedException {
        ReusableMethods.pressCoordinate(536, 1404, 1000);
        us002Page.clickButtonUs02(element);
        ReusableMethods.wait(2);
    }

    @Given("The user allows the notification to be sent and clicks {string} and warning button")
    public void the_user_allows_the_notification_to_be_sent_and_clicks_continue_and_warning_button(String element) throws InterruptedException {
        ReusableMethods.scrollWithUiScrollable("Allow");
        ReusableMethods.wait(2);
        us002Page.clickButtonUs02(element);
        ReusableMethods.pressCoordinate(626, 268, 4000);
        ReusableMethods.pressCoordinate(626, 268, 4000);
        ReusableMethods.scrollWithUiScrollable("okay");
        ReusableMethods.wait(7);
    }

    @Given("The user clicks on the {string} icon")
    public void the_user_clicks_on_the_qibla_icon(String element) {
        us002Page.clickButtonUs02(element);
    }

    @Given("On the page that opens the visibility of the map and qibla is verified")
    public void on_the_page_that_opens_the_visibility_of_the_map_and_qibla_is_verified() {
        assertTrue(us002Page.getMap().isDisplayed());
        assertTrue(us002Page.getMapText().isDisplayed());
    }

}

