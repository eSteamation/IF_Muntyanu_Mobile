package ru.iFellow.Pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {
    protected final By searchInput = By.xpath("//*[@resource-id='org.wikipedia:id/search_src_text']");
    private final By searchQuery = By.xpath("//*[@resource-id='org.wikipedia:id/search_container']");

    public void searchFor(String searchText) {
        driver.findElement(searchQuery).click();
        driver.findElement(searchInput).sendKeys(searchText);
    }
}