package ru.iFellow.Utility;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.jspecify.annotations.NonNull;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmuDriver implements WebDriverProvider {
    private static final String PLATFORM = ConfigReader.emulatorConfig.platformName();
    private static final String DEVICE = ConfigReader.emulatorConfig.deviceName();
    private static final String APP = ConfigReader.emulatorConfig.app();
    private static final String URL = ConfigReader.emulatorConfig.remoteURL();
    private static final String PACKAGE = ConfigReader.emulatorConfig.appPackage();
    private static final String PLATFORM_VERSION = ConfigReader.emulatorConfig.platformVersion();
    private static final String ACTIVITY_WAIT = ConfigReader.emulatorConfig.appWaitActivity();
    public static AndroidDriver driver;

    public static URL getUrl() {
        try {
            return new URL(URL);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static AndroidDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Драйвер не инициализирован");
        }
        return driver;
    }

    private String pathAbsolute() {
        File file = new File(APP);
        assertTrue(file.exists());
        return file.getAbsolutePath();
    }

    @NonNull
    @Override
    public WebDriver createDriver(@NonNull Capabilities capabilities) {
        try {
            UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
            uiAutomator2Options.setCapability("autoGrantPermissions", true);
            uiAutomator2Options.setCapability("deviceName", DEVICE);
            uiAutomator2Options.setCapability("platformName", PLATFORM);
            uiAutomator2Options.setCapability("platformVersion", PLATFORM_VERSION);
            uiAutomator2Options.setCapability("appWaitActivity", ACTIVITY_WAIT);
            uiAutomator2Options.setCapability("appPackage", PACKAGE);
            uiAutomator2Options.setCapability("app", pathAbsolute());
            driver = new AndroidDriver(getUrl(), uiAutomator2Options);
            return driver;
        } catch (Exception e) {
            throw new RuntimeException("Драйвер не инициализирован", e);
        }
    }
}
