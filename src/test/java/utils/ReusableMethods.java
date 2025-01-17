package utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ReusableMethods {

    public static void pressCoordinate(int xKoordinat, int yKoordinat, int bekleme) throws InterruptedException {
        TouchAction touchAction = new TouchAction<>(Driver.getAndroidDriver());
        touchAction.press(PointOption.point(xKoordinat, yKoordinat)).release().perform();
        Thread.sleep(bekleme);
    }

    public static void screenBottomScroll(int xKoordinat, int yKoordinat, int wait, int mxKoordinat, int myKoordinat, int bekleme) throws InterruptedException {
        TouchAction touchAction = new TouchAction<>(Driver.getAndroidDriver());
        touchAction
                .press(PointOption.point(xKoordinat, yKoordinat))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(wait)))
                .moveTo(PointOption.point(mxKoordinat, myKoordinat))
                .release()
                .perform();
        Thread.sleep(bekleme);
    }

    public static void screenRightScroll(int xKoordinat, int yKoordinat, int wait, int mXkoordinat, int mYkoordinat, int bekleme) throws InterruptedException {
        TouchAction touchAction = new TouchAction<>(Driver.getAndroidDriver());
        touchAction.press(PointOption.point(xKoordinat, yKoordinat))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(wait)))
                .moveTo(PointOption.point(mXkoordinat, mYkoordinat)).release().perform();
        Thread.sleep(bekleme);
    }

    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver driver = (AndroidDriver) Driver.getAndroidDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))");
        driver.findElementByXPath("//*[@text='" + elementText + "']").click();
    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhssmm").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getAndroidDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    public static void wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}