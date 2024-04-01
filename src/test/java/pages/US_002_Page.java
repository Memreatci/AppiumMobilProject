package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class US_002_Page extends BasePage {


    @FindBy(xpath = "//*[@text='CONTINUE']")
    private MobileElement continueButton;
    @FindBy(id = "com.hundred.qibla:id/tab_qibla")
    private MobileElement qiblaIcon;
    @FindBy(xpath = "com.hundred.qibla:id/tab_qibla")
    private MobileElement mapText;
    @FindBy(xpath = "//*[@resource-id='com.hundred.qibla:id/map_container']")
    private MobileElement map;

    public MobileElement getMapText() {
        return mapText;
    }

    public MobileElement getMap() {
        return map;
    }

    public void clickButtonUs02(String clickButton) {

        switch (clickButton) {
            case "Continue":
                continueButton.isDisplayed();
                continueButton.click();
                break;
            case "Qibla":
                qiblaIcon.isDisplayed();
                qiblaIcon.click();
                break;
        }
    }
}
