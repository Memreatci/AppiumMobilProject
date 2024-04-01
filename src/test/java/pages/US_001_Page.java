package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US_001_Page extends BasePage {


    @AndroidFindBy(accessibility = "Login")
    private MobileElement loginButton;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    private MobileElement emailTextBox;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    private MobileElement passwordTextBox;
    @AndroidFindBy(accessibility = "My Profile")
    private MobileElement myProfileText;
    @AndroidFindBy(accessibility = "LOGIN")
    private MobileElement loginPageLoginButton;

    @FindBy(xpath = "//*[@content-desc=\"Login\n" +
            "Not a member? \"]")
    private MobileElement inValidPasswordText;


    public void clickButtonUs01(String clickButton) throws InterruptedException {

        switch (clickButton) {
            case "login":
                loginButton.isDisplayed();
                loginButton.click();
                break;
            case "loginLP":
                loginPageLoginButton.isDisplayed();
                loginPageLoginButton.click();
                break;
        }
    }

    public void userMailTexBoxWrite(String mail) {
        emailTextBox.isDisplayed();
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys(mail);
        ReusableMethods.wait(1);
    }

    public void userPassTexBoxWrite(String password) {
        passwordTextBox.isDisplayed();
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
        ReusableMethods.wait(1);
    }

    public MobileElement getMyProfileText() {
        return myProfileText;
    }

    public MobileElement getLoginPageLoginButton() {
        return loginPageLoginButton;
    }

    public MobileElement getInvalidPasswordText() {
        return myProfileText;
    }
}
