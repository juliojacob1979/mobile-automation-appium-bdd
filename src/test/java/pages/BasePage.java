package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class BasePage {
    protected static AppiumDriver<MobileElement> driver;

    public static void startDriver() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformVersion", "13.0");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", "apps/Android-MyDemoAppRN.apk");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
