package ru.iFellow.Pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {

    private final By searchContainer = By.xpath("//*[@resource-id='org.wikipedia:id/search_container']");

    public void searchFor(String searchText) {
        driver.findElement(searchContainer).click();
        driver.findElement(searchInput).sendKeys(searchText);
    }
}