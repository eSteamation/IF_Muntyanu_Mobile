package ru.iFellow.Pages;

import io.appium.java_client.android.AndroidDriver;
import ru.iFellow.Utility.EmuDriver;

public abstract class BasePage {
    protected final AndroidDriver driver;

    public BasePage() {
        this.driver = EmuDriver.getDriver();
    }


}