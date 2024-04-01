package pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);

    }

    protected static US_001_Page us001Page;
    protected static US_002_Page us002Page;
    protected static US_003_Page us003Page;

    public static void initPages() {
        us001Page = new US_001_Page();
        us002Page = new US_002_Page();
        us003Page = new US_003_Page();
    }

}
