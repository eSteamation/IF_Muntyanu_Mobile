package ru.iFellow.Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchList extends BasePage {
    private final By firstText = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"org.wikipedia:id/page_list_item_title\")");

    public void verify(String firstCriterion, String secondCriterion) {
        String result = driver.findElement(firstText).getAttribute("text");
        assert result != null;
        assertTrue(result.contains(firstCriterion) && result.contains(secondCriterion));
    }

}