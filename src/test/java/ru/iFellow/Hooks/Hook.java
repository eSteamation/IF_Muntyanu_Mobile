package ru.iFellow.Hooks;

import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.iFellow.Utility.EmuDriver;

import java.time.Duration;

import static ru.iFellow.Utility.EmuDriver.driver;

public class Hook {

    @BeforeEach
    public void setUp() {
        new EmuDriver().createDriver(new UiAutomator2Options());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void tearDown() {
        if (EmuDriver.getDriver() != null) {
            EmuDriver.getDriver().quit();
            EmuDriver.driver = null;
        }
    }
}