package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.FindBy;
import utils.Driver;
import utils.ReusableMethods;

public class US_003_Page extends BasePage {


    @AndroidFindBy(accessibility = "Continue with Email")
    private MobileElement contWithEmail;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    private MobileElement yourNameTextBox;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    private MobileElement emailTextBox;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    private MobileElement passwordTextBox;
    @FindBy(xpath = "//*[@class='android.widget.CheckBox']")
    private MobileElement checkBox;
    @FindBy(xpath = "//*[@content-desc='REGISTER']")
    private MobileElement registerButton;


    public void register(String name, String mail, String password) throws InterruptedException {
        yourNameTextBox.sendKeys(name);
        emailTextBox.click();
        emailTextBox.sendKeys(mail);
        passwordTextBox.click();
        passwordTextBox.sendKeys(password);
        checkBox.click();
        registerButton.click();
    }

    public void clickButtonUs03(String clickButton) throws InterruptedException {
        if (clickButton.equals("Continue with Email")) {
            contWithEmail.isDisplayed();
            contWithEmail.click();
        }
    }
}
