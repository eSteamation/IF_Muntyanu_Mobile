package ru.iFellow.Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import ru.iFellow.Utility.EmuDriver;

public abstract class BasePage {
    protected final AndroidDriver driver;
    protected final By searchInput = By.xpath("//*[@resource-id='org.wikipedia:id/search_src_text']");
    protected final By searchQuery = By.xpath("//*[@resource-id='org.wikipedia:id/search_container']");

    public BasePage() {
        this.driver = EmuDriver.getDriver();
    }


}