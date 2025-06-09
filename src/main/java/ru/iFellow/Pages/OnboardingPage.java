package ru.iFellow.Pages;

import org.openqa.selenium.By;

public class OnboardingPage extends BasePage {
    private final By skipButton = By.xpath("//*[@resource-id='org.wikipedia:id/fragment_onboarding_skip_button']");

    public void skipOnboarding() {
        driver.findElement(skipButton).click();
    }
}
